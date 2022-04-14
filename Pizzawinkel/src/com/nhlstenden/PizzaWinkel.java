package com.nhlstenden;

import com.nhlstenden.factoryMethodPattern.PizzaFactory;
import com.nhlstenden.proxyPattern.GPSTracker;
import Pizzas.Pizza;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class PizzaWinkel implements Observer
{
    ArrayList<Order> orders;
    PizzaFactory fabriek = new PizzaFactory();
    OvenManager ovenManager = new OvenManager();

    // nieuwe order van de klant, hier begint het process
    public void newOrder(Order order) {
        ovenManager.addOrder(order);
    }

    // wanneer de klant een Pizza aanvraagt, halen we het pizza-object op uit de pizzafabriek.
    public Pizza createPizza(String Pizza) {
        return fabriek.createPizzas(Pizza);
    }

    // pizza is klaar
    public void PizzaReady(Order order) {
        orders.add(order);
    }

    // bezorg order
    public void deliverOrder(Order order) {
        new GPSTracker(order).Deliver();
        removeOrder(order);
    }

    // order is opgehaald
    public void pickupOrder(Order order) {
        removeOrder(order);
    }

    //    Verwijder order uit arraylist met orders die klaar zijn
    public void removeOrder(Order order) {
        if (orders.contains(order)) {
            orders.remove(order);
        }
    }

    // krijg een update vanuit OvenManager als een bestelling klaar is, daarna wordt het bezorgd
    @Override
    public void update(Observable o, Object arg)
    {
        deliverOrder((Order) arg);
    }
}
