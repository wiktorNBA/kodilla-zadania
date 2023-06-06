package com.kodilla.kodillagoodpatterns.allegro;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(final Order order) {
        System.out.println(order.getUser().getFirstName() + " " + order.getUser().getLastName() + " ordered " + order.getProduct() + " quantity " + order.getQuantity());
        return true;
    }
}
