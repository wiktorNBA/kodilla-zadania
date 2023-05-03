package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country  {

    private final String name;
    private final BigDecimal quantity;

    public Country(final String name, final BigDecimal quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPeopleQuantity() {
        return quantity;
    }
}
