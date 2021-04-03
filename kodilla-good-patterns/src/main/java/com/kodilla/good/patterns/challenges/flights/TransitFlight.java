package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public class TransitFlight {

    private String departureAirport;
    private String transitAirport;
    private String arrivalAirport;

    public TransitFlight(String departureAirport, String transitAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.transitAirport = transitAirport;
        this.arrivalAirport = arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransitFlight)) return false;
        TransitFlight that = (TransitFlight) o;
        return Objects.equals(departureAirport, that.departureAirport) && Objects.equals(transitAirport, that.transitAirport) && Objects.equals(arrivalAirport, that.arrivalAirport);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (departureAirport == null ? 0 : departureAirport.hashCode());
        hash = 31 * hash + (transitAirport == null ? 0 : transitAirport.hashCode());
        hash = 31 * hash + (arrivalAirport == null ? 0 : arrivalAirport.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return "[" + departureAirport + ", " +  transitAirport + ", " + arrivalAirport + "]";
    }
}
