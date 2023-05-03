package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String name;
    private final List<Country> listOfCountries = new ArrayList<>();

    public Continent(String name) {
        this.name = name;
    }

    public void addCountry(Country country){
        listOfCountries.add(country);
    }

    public boolean removeCountry(Country country){
        return  listOfCountries.remove(country);
    }

    public List<Country> getListOfCountries(){
        return listOfCountries;
    }
}

