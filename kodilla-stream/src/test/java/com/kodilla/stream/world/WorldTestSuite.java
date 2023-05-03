package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        // Given
        Country country1 = new Country("Germany", new BigDecimal("100000001"));
        Country country2 = new Country("Poland", new BigDecimal("200000002"));
        Country country3 = new Country("Norway", new BigDecimal("300000003"));
        Country country4 = new Country("Denmark", new BigDecimal("400000004"));
        Country country5 = new Country("England", new BigDecimal("500000005"));
        Country country6 = new Country("Wales", new BigDecimal("600000006"));
        Country country7 = new Country("Spain", new BigDecimal("700000007"));
        Country country8 = new Country("Italy", new BigDecimal("800000008"));
        Country country9 = new Country("France", new BigDecimal("900000009"));

        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("Africa");

        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        continent2.addCountry(country4);
        continent2.addCountry(country5);
        continent2.addCountry(country6);
        continent3.addCountry(country7);
        continent3.addCountry(country8);
        continent3.addCountry(country9);

        World world = new World();

        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        //When
        BigDecimal methodResult = world.getPeopleQuantity();
        BigDecimal calculatorResult = new BigDecimal("4500000045");

        //Then
        Assertions.assertEquals(calculatorResult, methodResult);
    }
}
