package com.nhlstenden;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;
import Pizzas.Pizza;


public class Oven extends Observable {
    private Pizza pizza;
    private boolean isBaking;

    public void notifySubscribers() {
        setChanged();
        notifyObservers();
        //Als er iets in de oven wordt geupdate, ziet de ovenObserver dat
    }

    // zet pizza in de oven
    public void addPizza(Pizza pizza) {
        this.pizza = pizza;
        this.isBaking = true;
        startTimer();
    }

    //    Start de oven timer
    private void startTimer() {
        Timer timer = new Timer();
        System.out.print("De oven staat aan\n\r");

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.print("De oven is klaar\n\r");
                pizzaIsReady();
            }
        }, 1 * 20 * 1000);
    }

    // pizza is klaar en mag worden opgehaald/bezorgd
    private void pizzaIsReady() {
        this.isBaking = false;
        notifySubscribers();
        System.out.print("Subscribers zijn genotivied\n\r");
    }

    public boolean isFilled() {
        return isBaking;
    }
}
