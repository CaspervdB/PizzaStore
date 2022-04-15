package com.nhlstenden;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OvenManager extends Observable implements Observer
{

    public ArrayList<Oven> ovens  =  new ArrayList<Oven>();
    public ArrayList<Pizza> waitingList  =  new ArrayList<Pizza>();
    public ArrayList<Order> orders  =  new ArrayList<Order>();

    public OvenManager() {
        addOvens();
    }

    Lock lock = new ReentrantLock();//Dit wordt gebruikt om de thread to locket zodat er niet perongeluk een pizza in de oven wordt gezet, die iemand anders ook al in de oven aan het zetten is

    //Drie ovens toevoegen
    private void addOvens()
    {
        Oven oven1 = new Oven(1);
        Oven oven2 = new Oven(2);
        Oven oven3 = new Oven(3);

        oven1.addObserver(this);
        oven2.addObserver(this);
        oven3.addObserver(this);

        this.ovens.add(oven1);
        this.ovens.add(oven2);
        this.ovens.add(oven3);
    }

    // bestelling in een oven stoppen en anders in de wachtrij
    public void addOrder(Order order)
    {
        this.orders.add(order);
        for (Pizza pizza : order.getPizzas())
        {
            if (checkIfOvenIsAvailable())
            {
                Oven oven = findAvailableOven();
                System.out.println(pizza.getDescription() + " wordt in oven " + oven.getNumber() + " gezet.");
                oven.addPizza(pizza);
            } else
            {
                waitingList.add(pizza);
                System.out.println("Er is geen oven meer beschikbaar, " + pizza.getDescription() + " is op wachtlijst gezet.");
            }
        }
    }

    //return een vrije oven
    private Oven findAvailableOven()
    {
        for (Oven oven : ovens)
        {
            if (!oven.isFilled())
                return oven;
        }
        return null;
    }

    // kijk of er een oven vrij is
    private boolean checkIfOvenIsAvailable()
    {
        for (Oven oven : ovens)
        {
            if (!oven.isFilled())
                return true;
        }
        return false;
    }

    // krijg een update van een oven als een pizza klaar is, daarna een nieuwe pizza in de oven doen vanuit de waitinglist
    @Override
    public void update(Observable o, Object arg)
    {
        lock.lock();
        checkIfOrderIsReady();
        if (!this.waitingList.isEmpty())
        {
            putPizzaFromWaitingListInOven();
            return;
        }
        System.out.println("Er staan geen pizza's meer op de wachtlijst.");
        lock.unlock();
    }

    private void putPizzaFromWaitingListInOven()
    {
        Oven oven = findAvailableOven();
        oven.addPizza(this.waitingList.get(0));
        System.out.println(this.waitingList.get(0).getDescription() + " is van de wachtlijst afgehaald en in oven " + oven.getNumber() + " geplaatst.");
        this.waitingList.remove(0);
        lock.unlock();
    }

    // kijk of een order klaar is en stuur hem dan door naar Pizzawinkel
    private void checkIfOrderIsReady()
    {
        for (Order order : orders)
        {
            int i = 0;
            for (Pizza pizza : order.getPizzas())
            {
                if (pizza.getBaked() == true)
                {
                    i++;
                    if (i == order.getPizzas().size())
                    {
                        System.out.println("Er is een order klaar");
                        setChanged();
                        notifyObservers(order);
                    }
                }
            }
        }
    }
}
