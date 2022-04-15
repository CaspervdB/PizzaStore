package com.nhlstenden;

import com.nhlstenden.factoryMethodPattern.PizzaFactory;
import com.nhlstenden.proxyPattern.GPSTracker;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class PizzaWinkel implements Observer
{
    ArrayList<Order> orders = new ArrayList<Order>();//Dit zijn de orders die klaar zijn
    PizzaFactory fabriek = new PizzaFactory();
    OvenManager ovenManager = new OvenManager();


    public PizzaWinkel() {
        for (Oven oven : ovenManager.ovens)
        {
            oven.addObserver(this);
        }
    }

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
        deliverOrder(order);
    }

    // bezorg order
    public void deliverOrder(Order order) {
        new GPSTracker(order).Deliver();
        removeOrder(order);
        System.out.print("De pizza is bezorgd");
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
        System.out.print("De pizza in de over is klaar\n\r");
        PizzaReady((Order) arg);
    }
}
