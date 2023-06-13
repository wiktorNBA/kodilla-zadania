package com.kodilla.kodillagoodpatterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Supplier{

    private String name;
    private final Map<Integer, String> depotOfProducts = new HashMap<>();

    public ExtraFoodShop() {
        this.name = "Extra Food Shop";
        putProducts();
    }

    private void putProducts(){
        depotOfProducts.put(1, "bread");
        depotOfProducts.put(2, "milk");
        depotOfProducts.put(3, "water");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void process(Order order) {
        if(depotOfProducts.containsKey(order.getCodeOfProduct())){
            System.out.println("Your order number is: " + order.getOrderNumber());
            System.out.println("Your order is: " + depotOfProducts.get(order.getCodeOfProduct()));
            System.out.println("Thank you for using the " + getName());
        }else {
            System.out.println("The selected product is not available.");
        }
    }
}


