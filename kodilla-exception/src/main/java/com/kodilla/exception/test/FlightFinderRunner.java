package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(new Flight("Warsaw", "Athens"));
        } catch (RouteNotFoundException e) {
            System.out.println("Could not find flight!");
        }
    }
}
