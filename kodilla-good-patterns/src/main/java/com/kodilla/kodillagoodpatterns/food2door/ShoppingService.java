package com.kodilla.kodillagoodpatterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class ShoppingService {

    private Map<Integer,Supplier> suppliers = new HashMap<>();

    public ShoppingService(){
        fillArticles();
    }

    Supplier extraFoodShop = new ExtraFoodShop();
    Supplier glutenFreeShop = new GlutenFreeShop();
    Supplier healthyShop = new HealthyShop();


    private void fillArticles(){
        suppliers.put(1, extraFoodShop);
        suppliers.put(2, extraFoodShop);
        suppliers.put(3, extraFoodShop);
        suppliers.put(4, glutenFreeShop);
        suppliers.put(5, glutenFreeShop);
        suppliers.put(6, glutenFreeShop);
        suppliers.put(7, healthyShop);
        suppliers.put(8, healthyShop);
        suppliers.put(9, healthyShop);
    }

    public void process(Order order){
        if(suppliers.containsKey(order.getCodeOfProduct())){
            suppliers.get(order.getCodeOfProduct()).process(order);
        }else {
            System.out.println("your order has not completed successfully");
        }
    }

}
