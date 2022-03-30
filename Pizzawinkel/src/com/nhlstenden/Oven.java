package com.nhlstenden;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;


public class Oven extends Observable
{
    private Pizza pizza;
    private boolean isBaking;

    public void notifySubscribers()
    {
        notifyObservers();
        //Als er iets in de oven wordt geupdate, ziet de ovenObserver dat
    }

    public void addPizza(Pizza pizza)
    {
        this.pizza = pizza;
        this.isBaking = true;
        startTimer();
    }

    private void startTimer()
    {

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                pizzaIsReady();
            }
        }, 1*20*1000);
    }

    private void pizzaIsReady()
    {
        this.isBaking = false;
        notifySubscribers();
    }

    public boolean isFilled()
    {
        return isBaking;
    }
}
