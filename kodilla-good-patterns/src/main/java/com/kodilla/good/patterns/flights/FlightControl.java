package com.kodilla.good.patterns.flights;

public interface FlightControl {
    boolean isDirectFlightAvailable(String from, String to);
    boolean isRouteAvailable(String[] airports);
}
