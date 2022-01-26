package com.kodilla.exception.test;

public class FlightSearchEngineRunner {
    public static void main(String[] args){
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();
        //Flight flight = new Flight("London Heathrow Airport","Amsterdam Airport");
        Flight flight = new Flight("London Heathrow Airport","Barcelona Airport");
        String outputString = "";
        try{
            if(flightSearchEngine.searchFlight(flight)){
                outputString = "Flight possible! =)";
            }else{
                outputString = "Flight impossible! =(";
            }
        }catch (RouteNotFoundException routeNotFoundException){
            outputString = routeNotFoundException.getMessage();
        }finally {
            System.out.println(outputString);
        }
    }
}
