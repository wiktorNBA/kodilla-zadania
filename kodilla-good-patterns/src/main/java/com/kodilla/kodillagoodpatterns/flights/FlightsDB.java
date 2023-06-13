package com.kodilla.kodillagoodpatterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightsDB {
    private final List<Flight> base = new ArrayList<>();

    public FlightsDB() {
        addFlightsToDB();
    }

    private List<Flight> addFlightsToDB() {
        base.add(new Flight("a", "b"));
        base.add(new Flight("a", "c"));
        base.add(new Flight("d", "e"));
        base.add(new Flight("e", "c"));
        base.add(new Flight("c", "b"));
        base.add(new Flight("d", "c"));
        base.add(new Flight("b", "c"));
        base.add(new Flight("b", "e"));
        return base;
    }

    public Set<Flight> connectedFlights(String depature, String arrival){

        Set<Flight> results = new HashSet<>();

        List<Flight> flightsWithSameDepature = base.stream()
                .filter(flight -> flight.getDepartureAirport().equals(depature))
                .collect(Collectors.toList());

        List<Flight> flightsWithSameArrival = base.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrival))
                .collect(Collectors.toList());

        for (Flight flight1 : flightsWithSameDepature) {
            for (Flight flight2 : flightsWithSameArrival) {
                if (flight1.getArrivalAirport().equals(flight2.getDepartureAirport())) {
                    results.add(flight1);
                    results.add(flight2);
                }
            }
        }

        return results;
    }

    public Set<Flight> findAllFlightsToCity(String city) {
        return base.stream()
                .filter(flight -> flight.getArrivalAirport().equals(city))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findAllFlightsFromCity(String city) {
        return base.stream()
                .filter(flight -> flight.getDepartureAirport().equals(city))
                .collect(Collectors.toSet());
    }

    @Override
    public String toString() {
        return "FlightBase{" +
                "base=" + base +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightsDB that = (FlightsDB) o;
        return Objects.equals(base, that.base);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base);
    }
}
