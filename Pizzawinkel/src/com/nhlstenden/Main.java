package com.nhlstenden;

import Pizzas.Pizza;
import Pizzas.Salami;
import com.nhlstenden.decoratorPattern.Ananas;
import com.nhlstenden.decoratorPattern.ExtraKaas;
import com.nhlstenden.decoratorPattern.KaasInKorst;
import com.nhlstenden.factoryMethodPattern.PizzaSalami;

public class Main
{
    public static void main(String[] args)
    {
        PizzaWinkel martini = new PizzaWinkel();
        Order bestellingEen = new Order();
        Pizza pizzaEen = new Salami();
        bestellingEen.addPizza(pizzaEen);
        martini.newOrder(bestellingEen);
    }
}
