package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

public class FlightSearchEngineTestSuite {

    final FlightSearchEngine flightSearchEngine = new FlightSearchEngine();

    @ParameterizedTest
    @MethodSource("generatedAirportListForExceptionTest")
    void exceptionTestSearchFlight(Flight flight, Boolean expect) {
        //Given
        Optional<Flight> flightOptional = Optional.ofNullable(flight);
        //When & Then
         if(expect) {
             flightOptional.ifPresent( flightOpt ->
                     Assertions.assertThrows(RouteNotFoundException.class, () -> flightSearchEngine.searchFlight(flightOpt)));

         }else {
             flightOptional.ifPresent( flightOpt ->
             Assertions.assertDoesNotThrow(() -> flightSearchEngine.searchFlight(flightOpt)));
         }
    }

    @ParameterizedTest
    @MethodSource("generatedAirportListForValueTest")
    void valueTestSearchFlight(Flight flight, Boolean except){
        //Given
        Optional<Flight> flightOptional = Optional.ofNullable(flight);

        //When
        final Boolean[] result = {false};
        flightOptional.ifPresent( flightOpt -> {
            try {
                result[0] = flightSearchEngine.searchFlight(flightOpt);
            } catch (RouteNotFoundException e) {
                // ignore
            }
        });

        //Then
        Assertions.assertEquals(!except,result[0]);
    }

    private static Stream<Arguments> generatedAirportListForExceptionTest(){
        return Stream.of(
                Arguments.of(new Flight("",""),true),
                Arguments.of(null,true),
                Arguments.of(new Flight("London Heathrow Airport","Frankfurt International Airport"),false),
                Arguments.of(new Flight("Frankfurt International Airport","Rome Fiumicino Airport"),false),
                Arguments.of(new Flight("Rome Fiumicino Airport","Barcelona Airport"),true)

        );
    }
    private static Stream<Arguments> generatedAirportListForValueTest(){
        return Stream.of(
                Arguments.of(new Flight("",""),true),
                Arguments.of(null,true),
                Arguments.of(new Flight("London Heathrow Airport","Frankfurt International Airport"),true),
                Arguments.of(new Flight("Frankfurt International Airport","Rome Fiumicino Airport"),false),
                Arguments.of(new Flight("Rome Fiumicino Airport","Barcelona Airport"),true)

        );
    }
}
