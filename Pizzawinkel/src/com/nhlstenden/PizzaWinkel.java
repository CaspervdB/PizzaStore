package com.nhlstenden;

import com.nhlstenden.factoryMethodPattern.PizzaFactory;
import com.nhlstenden.proxyPattern.GPSTracker;

import java.util.ArrayList;

public class PizzaWinkel {
    ArrayList<Order> orders;
    PizzaFactory fabriek = new PizzaFactory();
    OvenManager ovenManager = new OvenManager();

    public void newOrder(Order order) {
        ovenManager.addOrder(order);
    }

    public Pizza createPizza(String Pizza) {
        return fabriek.createPizzas(Pizza);
    }

    public void PizzaReady(Order order) {
        orders.add(order);
    }

    public void deliverOrder(Order order) {
        new GPSTracker(order);
        removeOrder(order);
    }

    public void pickupOrder(Order order){
        removeOrder(order);
    }

    public void removeOrder(Order order){
        if(orders.contains(order)){
            orders.remove(order);
        }
    }
}
