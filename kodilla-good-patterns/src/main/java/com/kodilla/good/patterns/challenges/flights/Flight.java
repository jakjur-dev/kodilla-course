package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public class Flight {


    private String departureAirport;
    private String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return getDepartureAirport().equals(flight.getDepartureAirport()) && getArrivalAirport().equals(flight.getArrivalAirport());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (departureAirport == null ? 0 : departureAirport.hashCode());
        hash = 31 * hash + (arrivalAirport == null ? 0 : arrivalAirport.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return '[' + departureAirport + ", " + arrivalAirport + ']';
    }
}
