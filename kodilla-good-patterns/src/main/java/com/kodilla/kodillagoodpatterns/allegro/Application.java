package com.kodilla.kodillagoodpatterns.allegro;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        InformationService informationService = new OrderInformationService();
        OrderService orderService = new ProductOrderService();
        OrderProcessor orderProcessor = new OrderProcessor(informationService, orderService);
        orderProcessor.process(new User("Adam", "Malysz"), "skis", 2, LocalDate.now(), true);
    }
}
