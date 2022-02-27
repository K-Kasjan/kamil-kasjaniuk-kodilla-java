package com.kodilla.good.patterns.flights;

public interface Flight {
    String getTakeoffAirport();
    String getDestinationAirport();
    boolean equals(Object object);
    int hashCode();
}
