package com.nhlstenden;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;
import com.nhlstenden.Pizza;


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

        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        pizzaIsReady();
                    }
                },
                5000
        );
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
