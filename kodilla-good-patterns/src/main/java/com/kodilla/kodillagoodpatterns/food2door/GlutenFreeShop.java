package com.kodilla.kodillagoodpatterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Supplier {

    private String name;
    private final Map<Integer, String> depotOfProducts = new HashMap<>();

    public GlutenFreeShop(){
        this.name = "Gluten Free Shop";
        putProducts();
    }

    private void putProducts(){
        depotOfProducts.put(4, "orange juice");
        depotOfProducts.put(5, "eggs");
        depotOfProducts.put(6, "apples");
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
