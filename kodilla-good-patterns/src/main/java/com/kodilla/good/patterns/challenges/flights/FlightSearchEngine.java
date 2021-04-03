package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchEngine {

    ArrayList<Flight> flightsList = new ArrayList<Flight>();

    public FlightSearchEngine(ArrayList<Flight> flightsList) {
        this.flightsList = flightsList;
    }

    public ArrayList<Flight> findFlightsFromCity(String departureCity){

        ArrayList<Flight> flightsFromCity = flightsList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureCity))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Found " + flightsFromCity.size() + " flights from " + departureCity + ": \n" + flightsFromCity);

        return flightsFromCity;
    }

    public ArrayList<Flight> findFlightsToCity(String arrivalCity){

        ArrayList<Flight> flightsToCity = flightsList.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalCity))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Found " + flightsToCity.size() + " flights to " + arrivalCity + ": \n" + flightsToCity);

        return flightsToCity;
    }

    public ArrayList<TransitFlight> findTransitFlightsToCity(String departureCity, String arrivalCity){

        List<Flight> flightsFromDepartureCity = flightsList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureCity))
                .collect(Collectors.toList());

        List<Flight> flightsToArrivalCity = flightsList.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalCity))
                .collect(Collectors.toList());

        ArrayList<TransitFlight> findTransitFlightsToCity = new ArrayList<>();

        for (Flight firstFlight : flightsFromDepartureCity){
            for(Flight secondFlight : flightsToArrivalCity){
                if (firstFlight.getArrivalAirport().equals(secondFlight.getDepartureAirport())){
                    findTransitFlightsToCity.add(new TransitFlight(firstFlight.getDepartureAirport(),
                            firstFlight.getArrivalAirport(), secondFlight.getArrivalAirport()));
                }
            }
        }

        System.out.println("Found " + findTransitFlightsToCity.size() + " transit flights between " + departureCity
                + " and " + arrivalCity + ": \n" + findTransitFlightsToCity);

        return findTransitFlightsToCity;
    }
}
