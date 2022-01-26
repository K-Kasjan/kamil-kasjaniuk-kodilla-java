package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchEngine {
    Map<String, Boolean> airportsList = new HashMap<>();

    public FlightSearchEngine(){
        airportsList.put("London Heathrow Airport",true);
        airportsList.put("Paris Charles de Gaulle Airport",false);
        airportsList.put("Frankfurt International Airport",false);
        airportsList.put("Amsterdam Airport",true);
        airportsList.put("Rome Fiumicino Airport",true);
    }

    public boolean searchFlight(Flight flight) throws RouteNotFoundException{
        if(!airportsList.containsKey(flight.getArrivalAirport()))
            throw new RouteNotFoundException("Sorry, arrival Airport doesn't exist!");

        if(!airportsList.containsKey(flight.getDepartureAirport()))
            throw new RouteNotFoundException("Sorry, departure Airport doesn't exist!");

        return airportsList.get(flight.getArrivalAirport());
    }
}
