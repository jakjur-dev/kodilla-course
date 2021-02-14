package com.kodilla.testing.weather.stub;

import java.util.*;


public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverage() {

        double average = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            average += temperature.getValue();
        }
        average = average / temperatures.getTemperatures().size();
        return average;
    }

    public double calculateMedian() {

        List<Double> sorted = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sorted.add(temperature.getValue());
        }
        Collections.sort(sorted);
        double median = 0;

        if (sorted.size() % 2 == 0) {
            median = (sorted.get((sorted.size() - 1) / 2) + sorted.get(sorted.size() / 2)) / 2;
        } else {
            median = sorted.get(((sorted.size()) - 1) / 2);
        }
        return median;
    }
}
