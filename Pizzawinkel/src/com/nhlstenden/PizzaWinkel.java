package com.nhlstenden;

import com.nhlstenden.factoryMethodPattern.PizzaFactory;
import com.nhlstenden.proxyPattern.GPSTracker;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PizzaWinkel implements Observer
{
    ArrayList<Order> orders = new ArrayList<Order>();//Dit zijn de orders die klaar zijn
    PizzaFactory fabriek = new PizzaFactory();
    OvenManager ovenManager = new OvenManager();

    Lock lock = new ReentrantLock();

    public PizzaWinkel() {
        ovenManager.addObserver(this);
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
        printBon(order);
        deliverOrder(order);
    }

    private void printBon(Order order){
        for (Pizza pizza : order.getPizzas())
        {
            this.printPizza(pizza);
        }
    }

    /*
    * Print de kosten en omschrijving van een pizza
    * @param p Pizza object
    */
    private static void printPizza(Pizza p)
    {
        System.out.println("Cost: " + p.getCost() + ", description: " + p.getDescription());
    }

    // bezorg order
    public void deliverOrder(Order order) {
        new GPSTracker(order).Deliver();
        removeOrder(order);;
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
        PizzaReady((Order) arg);
    }
}
