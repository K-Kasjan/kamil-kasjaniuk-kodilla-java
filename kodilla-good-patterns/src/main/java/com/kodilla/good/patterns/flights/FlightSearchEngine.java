package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightSearchEngine {
    public static void main(String[] args){

        Set<Flight> flightSet = new HashSet<>();
        flightSet.add(new DirectFlight("Kraków","Gdańsk"));
        flightSet.add(new DirectFlight("Warszawa","Wrocław"));
        flightSet.add(new DirectFlight("Warszawa","Kraków"));
        flightSet.add(new DirectFlight("Gdańsk","Kraków"));
        flightSet.add(new DirectFlight("Gdańsk","Warszawa"));

        FlightControlService flightControlService = new FlightControlService(flightSet);
        System.out.println("Kraków - Warszawa :"+flightControlService.isDirectFlightAvailable("Kraków","Warszawa"));
        System.out.println("Kraków - Gdańsk - Warszawa :"+flightControlService.isRouteAvailable(new String[]{
                "Kraków","Gdańsk","Warszawa"
        }));
    }
}
