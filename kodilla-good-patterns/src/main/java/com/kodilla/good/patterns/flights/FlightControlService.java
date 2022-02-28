package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightControlService implements FlightControl{
    Set<Flight> flightHashSet;

    public FlightControlService(Set<Flight> flightHashSet) {
        this.flightHashSet = flightHashSet;
    }

    @Override
    public List<Flight> getAllFlightsFrom(String takeoff) {
        return flightHashSet.stream()
                .filter(flight -> flight.getTakeoffAirport().equals(takeoff))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> getAllFlightsTo(String destination) {
        return flightHashSet.stream()
                .filter(flight -> flight.getDestinationAirport().equals(destination))
                .collect(Collectors.toList());
    }

    @Override
    public boolean isDirectFlightAvailable(String from, String to) {
        DirectFlight tempFlight = new DirectFlight(from, to);
        return flightHashSet.stream()
                .anyMatch(flight -> flight.equals(tempFlight));
    }

    @Override
    public boolean isRouteAvailable(String[] airports) {
        if(airports.length<2)
            return false;
        for(int i = 1 ; i > airports.length ; i++){
            if(!isDirectFlightAvailable(airports[i-1],airports[i]))
                return false;
        }
        return true;
    }
}
