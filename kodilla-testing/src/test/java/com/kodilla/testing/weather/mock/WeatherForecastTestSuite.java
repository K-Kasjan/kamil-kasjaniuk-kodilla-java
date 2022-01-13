package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @Test
    @DisplayName("Forecast calculation")
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    @DisplayName("Average calculation")
    void testCalculateAverageTemperature(){
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 0d);
        temperaturesMap.put("Krakow", 1d);
        temperaturesMap.put("Wroclaw", 1d);
        temperaturesMap.put("Warszawa", 1d);
        temperaturesMap.put("Gdansk", 2d);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averageTemperature = weatherForecast.calculateAverageTemperature();

        //Then
        Assertions.assertEquals(1, averageTemperature);
    }

    @Test
    @DisplayName("Median calculate when even List size")
    void testCalculateMedianTemperatureWhenEven(){
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 0d);
        temperaturesMap.put("Krakow", 1d);
        temperaturesMap.put("Wroclaw", 2d);
        temperaturesMap.put("Warszawa", 3d);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianTemperature = weatherForecast.calculateMedianTemperature();

        //Then
        Assertions.assertEquals(1.5, medianTemperature);
    }

    @Test
    @DisplayName("Median calculate when odd List size")
    void testCalculateMedianTemperatureWhenOdd(){
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 0d);
        temperaturesMap.put("Krakow", 1d);
        temperaturesMap.put("Wroclaw", 2d);
        temperaturesMap.put("Warszawa", 3d);
        temperaturesMap.put("Gdansk", 4d);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianTemperature = weatherForecast.calculateMedianTemperature();

        //Then
        Assertions.assertEquals(2, medianTemperature);
    }
}