package com.nhlstenden;

import factoryMethodPattern.PizzaFactory;

import java.util.ArrayList;

public class PizzaWinkel
{
    ArrayList<Bestelling> Bestellingen;
    PizzaFactory fabriek = new PizzaFactory();
    OvenManager ovenManager = new OvenManager();
//    String[] pizzaList = new String[]{"Salami", "Kebab", "Champignon"};
//    ArrayList<Pizza> StandaardPizzas =

    public void newOrder(Bestelling bestelling)
    {
        ovenManager.addOrder(bestelling);
//        ovenManager.getWaitTime();
    }

    public Pizza createPizza(String Pizza){
        return fabriek.createPizzas(Pizza);
    }

    public void PizzaReady(Bestelling bestelling)
    {
        Bestellingen.add(bestelling);
    }
}
