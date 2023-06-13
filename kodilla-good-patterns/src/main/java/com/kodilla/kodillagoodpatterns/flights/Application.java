package com.kodilla.kodillagoodpatterns.flights;

public class Application {

    public static void main(String[] args) {

        FlightsDB flightDB = new FlightsDB();

        System.out.println(flightDB.connectedFlights("a", "e"));
        System.out.println(flightDB.findAllFlightsToCity("c"));
        System.out.println(flightDB.findAllFlightsFromCity("d"));
    }
}
