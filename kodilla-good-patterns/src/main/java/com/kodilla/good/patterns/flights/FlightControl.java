package com.kodilla.good.patterns.flights;

import java.util.List;

public interface FlightControl {
    boolean isDirectFlightAvailable(String from, String to);
    boolean isRouteAvailable(String[] airports);
    List<Flight> getAllFlightsFrom(String takeoff);
    List<Flight> getAllFlightsTo(String destination);
}
