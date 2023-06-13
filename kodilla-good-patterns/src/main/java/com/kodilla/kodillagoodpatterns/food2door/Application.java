package com.kodilla.kodillagoodpatterns.food2door;

public class Application {
    public static void main(String[] args){
        Order order = new Order(1, 100);
        ShoppingService shoppingService = new ShoppingService();
        shoppingService.process(order);
    }
}
