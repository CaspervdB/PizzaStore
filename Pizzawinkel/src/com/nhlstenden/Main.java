package com.nhlstenden;

import com.nhlstenden.factoryMethodPattern.PizzaSalami;

public class Main
{
    public static void main(String[] args)
    {
        PizzaWinkel martini = new PizzaWinkel();
        Order bestellingEen = new Order();
        Pizza pizzaEen = new PizzaSalami();
        bestellingEen.addPizza(pizzaEen);
        martini.newOrder(bestellingEen);
    }
}
