package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class FlightSearcher {
    private static Map<String, Boolean> arrivalAbilities = new HashMap<>();

    {
        arrivalAbilities.put("Singapore Changi", false);
        arrivalAbilities.put("Tokyo Intl Haneda", true);
        arrivalAbilities.put("Munich Airport", true);
        arrivalAbilities.put("Hong Kong Intl Airport", false);
        arrivalAbilities.put("Zurich Airport", true);
        arrivalAbilities.put("Heathrow Airport", true);

    }

    public boolean findFilght(Flight flight) throws RouteNotFoundException {
        if (flight == null) {
            throw new IllegalArgumentException();
        }

        String arrival = flight.getArrivalAirport();
        if (!arrivalAbilities.containsKey(arrival)) {
            throw new RouteNotFoundException(flight);
        }
        return arrivalAbilities.get(arrival);
    }
}