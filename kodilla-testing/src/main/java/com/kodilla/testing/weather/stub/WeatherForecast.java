package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature(){
        double averageTemperature = 0;
        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            averageTemperature += temperature.getValue();
        }
        return averageTemperature / temperatures.getTemperatures().size();
    }

    public double calculateMedianTemperature(){
        List<Map.Entry<String, Double>> temperatureList = new LinkedList<>(temperatures.getTemperatures().entrySet());
        temperatureList.sort(Map.Entry.comparingByValue());

        if(temperatures.getTemperatures().size() % 2 == 1){
            return temperatureList.get(temperatureList.size()/2).getValue();
        }

        return  ( temperatureList.get(temperatureList.size()/2).getValue() +
                temperatureList.get(temperatureList.size()/2-1).getValue() ) /2;
    }
}