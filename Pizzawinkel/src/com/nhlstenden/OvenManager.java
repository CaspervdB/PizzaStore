package com.nhlstenden;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class OvenManager extends Observable implements Observer
{

    public ArrayList<Oven> ovens  =  new ArrayList<Oven>();
    public ArrayList<Pizza> waitingList  =  new ArrayList<Pizza>();
    public ArrayList<Order> orders  =  new ArrayList<Order>();

    public OvenManager() {
        addOvens();
    }

    private void addOvens()
    {
        Oven oven1 = new Oven();
        Oven oven2 = new Oven();
        Oven oven3 = new Oven();
        this.ovens.add(oven1);
        this.ovens.add(oven2);
        this.ovens.add(oven3);
    }

    // bestelling in een oven stoppen en anders in de wachtrij
    public void addOrder(Order order)
    {
        this.orders.add(order);
        for (Pizza pizza : order.getPizzas())
            if (checkIfOvenISAvaileble())
            {
                Oven oven = findAvailebleOven();
                oven.addPizza(pizza);
                System.out.print("Pizza is in oven gezet");
            } else
            {
                waitingList.add(pizza);
                System.out.print("Er geen geen oven beschikbaar, pizza is op wachtlijst gezet");
            }
    }

    //return een vrije oven
    private Oven findAvailebleOven()
    {
        for (Oven oven : ovens)
        {
            if (!oven.isFilled())
                return oven;
        }
        return null;
    }

    // kijk of er een oven vrij is
    private boolean checkIfOvenISAvaileble()
    {
        for (Oven oven : ovens)
        {
            if (!oven.isFilled())
                return true;
        }
        return false;
    }

    // krijg een update van een oven als een piza klaar is, daarna een nieuwe pizza in de oven doen vanuit de waintinglist
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

    // kijk of een order klaar is en stuur hem dan door naar Pizzawinkel
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
                        notifyObservers(order);
                    }
                }
            }
        }
    }
}
