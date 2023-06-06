package com.kodilla.kodillagoodpatterns.allegro;

import java.time.LocalDate;

public class OrderProcessor {
    private final InformationService informationService;
    private final OrderService productOrderService;

    public OrderProcessor(InformationService informationService, OrderService productOrderService) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
    }

    public Order process(User user, String product, int quantity, LocalDate dateOfOrder, boolean isOrdered) {
        boolean result = productOrderService.order(new Order(user, product, quantity, dateOfOrder, isOrdered));
        informationService.inform(user);
        return new Order(user, product, quantity, dateOfOrder, isOrdered);
    }
}
