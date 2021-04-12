package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsListRetriever {

    public ArrayList<Flight> retrieve(){

        ArrayList<Flight> flightsList = new ArrayList<Flight>();
        flightsList.add(new Flight("GDANSK", "WROCLAW"));
        flightsList.add(new Flight("GDANSK", "WARSZAWA"));
        flightsList.add(new Flight("GDANSK", "POZNAN"));
        flightsList.add(new Flight("GDANSK", "KRAKOW"));
        flightsList.add(new Flight("WROCLAW", "GDANSK"));
        flightsList.add(new Flight("WROCLAW", "WARSZAWA"));
        flightsList.add(new Flight("WROCLAW", "POZNAN"));
        flightsList.add(new Flight("WROCLAW", "KRAKOW"));
        flightsList.add(new Flight("WARSZAWA", "WROCLAW"));
        flightsList.add(new Flight("WARSZAWA", "GDANSK"));
        flightsList.add(new Flight("WARSZAWA", "POZNAN"));
        flightsList.add(new Flight("WARSZAWA", "KRAKOW"));
        flightsList.add(new Flight("KRAKOW", "WROCLAW"));
        flightsList.add(new Flight("KRAKOW", "WARSZAWA"));
        flightsList.add(new Flight("KRAKOW", "POZNAN"));
        flightsList.add(new Flight("KRAKOW", "GDANSK"));
        flightsList.add(new Flight("POZNAN", "WROCLAW"));
        flightsList.add(new Flight("POZNAN", "WARSZAWA"));
        flightsList.add(new Flight("POZNAN", "KRAKOW"));
        flightsList.add(new Flight("POZNAN", "GDANSK"));

        return flightsList;
    }
}
