package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Berlin", true);
        airports.put("Paris", true);
        airports.put("Madrid", false);
        airports.put("Rome", true);
        airports.put("Lisbon", false);
        airports.put("Vienna", true);
        airports.put("Athens", false);
        airports.put("Amsterdam", false);

        if (airports.containsKey(flight.getDepartureAirport()) && airports.containsKey(flight.getArrivalAirport())
            && airports.get(flight.getArrivalAirport())) {
            System.out.println("Found flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + "!");
        } else {
            throw new RouteNotFoundException("City not existing in database or unreachable");
        }
    }
}
