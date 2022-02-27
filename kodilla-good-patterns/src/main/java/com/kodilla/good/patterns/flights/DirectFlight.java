package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class DirectFlight implements Flight{
    private String takeoffAirport;
    private String destinationAirport;

    public DirectFlight(String takeoffAirport, String destinationAirport) {
        this.takeoffAirport = takeoffAirport;
        this.destinationAirport = destinationAirport;
    }

    @Override
    public String getTakeoffAirport() {
        return takeoffAirport;
    }

    @Override
    public String getDestinationAirport() {
        return destinationAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DirectFlight that = (DirectFlight) o;
        return Objects.equals(takeoffAirport, that.takeoffAirport) && Objects.equals(destinationAirport, that.destinationAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(takeoffAirport);
    }
}
