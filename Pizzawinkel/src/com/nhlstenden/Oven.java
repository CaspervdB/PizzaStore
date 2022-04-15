package com.nhlstenden;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.nhlstenden.Pizza;


public class Oven extends Observable {
    private Pizza pizza;
    private boolean isBaking;
    private int number;
    Lock lock = new ReentrantLock();

    public Oven(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    //Als er iets in de oven wordt geupdate, ziet de ovenObserver dat
    public void notifySubscribers() {
        setChanged();
        notifyObservers();
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
        lock.lock();
        this.pizza.setBaked(true);
        lock.unlock();
        isBaking = false;
        System.out.println(this.pizza.getDescription() + " in oven " + this.getNumber() + " is gaar.");
        notifySubscribers();
    }

    //Kijk of er iets in de oven zit
    public boolean isFilled() {
        return isBaking;
    }
}
