package com.kodilla.kodillagoodpatterns.food2door;

public class Order {

    private final int typeOfProduct;
    private final int orderNumber;

    public Order(int typeOfProduct, int orderNumber) {

        this.typeOfProduct = typeOfProduct;
        this.orderNumber = orderNumber;
    }


    public int getCodeOfProduct() {
        return typeOfProduct;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
}
