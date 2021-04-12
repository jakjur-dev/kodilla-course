package com.kodilla.good.patterns.challenges.flights;

public class FlightSearchApplication {
    public static void main(String[] args) {

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(new FlightsListRetriever().retrieve());
        flightSearchEngine.findFlightsFromCity("WROCLAW");
        flightSearchEngine.findFlightsToCity("POZNAN");
        flightSearchEngine.findTransitFlightsToCity("WROCLAW", "POZNAN");

    }
}
