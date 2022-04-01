package com.nhlstenden;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class OvenManager implements Observer
{

    public ArrayList<Oven> ovens  =  new ArrayList<Oven>();
    public ArrayList<Pizza> waitingList  =  new ArrayList<Pizza>();
    public ArrayList<Order> orders  =  new ArrayList<Order>();


    private void addOvens()
    {
        Oven oven1 = new Oven();
        this.ovens.add(oven1);
    }

    public void addOrder(Order order)
    {
        this.orders.add(order);
        for (Pizza pizza : order.getPizzas())
            if (checkIfOvenISAvaileble())
            {
                Oven oven = findAvailebleOven();
                oven.addPizza(pizza);
            } else
                waitingList.add(pizza);
    }

    private Oven findAvailebleOven()
    {
        for (Oven oven : ovens)
        {
            if (!oven.isFilled())
                return oven;
        }
        return null;
    }

    private boolean checkIfOvenISAvaileble()
    {
        for (Oven oven : ovens)
        {
            if (!oven.isFilled())
                return true;
        }
        return false;
    }

    @Override
    public void update(Observable o, Object arg)
    {
        checkIfOrderIsReady();

        Oven oven = findAvailebleOven();
        if (this.waitingList != null)
        {
            oven.addPizza(waitingList.get(0));
            this.waitingList.remove(0);
        }
    }

    private void checkIfOrderIsReady()
    {
        for (Order order : orders)
        {
            int i = 0;
            for (Pizza pizza : order.getPizzas())
            {
                if (pizza.getBaked() == false)
                {
                    i++;
                    if (i == order.getPizzas().size())
                    {
//                        com.nhlstenden.PizzaWinkel.pizzaReady(bestelling);
                    }
                }
            }
        }
    }
}
