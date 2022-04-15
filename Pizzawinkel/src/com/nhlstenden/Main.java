package com.nhlstenden;

import Pizzas.Pizza;
import Pizzas.Salami;
import com.nhlstenden.decoratorPattern.Ananas;
import com.nhlstenden.decoratorPattern.ExtraKaas;
import com.nhlstenden.decoratorPattern.KaasInKorst;
import com.nhlstenden.factoryMethodPattern.PizzaChampignon;
import com.nhlstenden.factoryMethodPattern.PizzaKebab;
import com.nhlstenden.factoryMethodPattern.PizzaMargaritha;
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

        /**
         * Aanmaken van Pizza's
         */
        Pizza pizzaSalami = new PizzaSalami();
        Pizza pizzaFungi = new PizzaChampignon();
        Pizza pizzaKebab = new PizzaKebab();
        Pizza pizzaMargaritha = new PizzaMargaritha();

        /**
         * Toppings toevoegen door middel van de decorator
         */
        pizzaSalami = new Ananas(pizzaSalami);
        pizzaSalami = new ExtraKaas(pizzaSalami);
        pizzaSalami = new KaasInKorst(pizzaSalami);

        pizzaFungi = new Ananas(pizzaFungi);
        pizzaFungi = new ExtraKaas(pizzaFungi);

        pizzaKebab = new ExtraKaas(pizzaKebab);

        /**
         * Pizza informatie printen op de console
         */
        printPizza(pizzaSalami);
        printPizza(pizzaFungi);
        printPizza(pizzaKebab);
        printPizza(pizzaMargaritha);
    }

    /**
     * Print de kosten en omschrijving van een pizza
     * @param p Pizza object
     */

    private static void printPizza(Pizza p)
    {
        System.out.println("Cost: " + p.getCost() + ", description: " + p.getDescription());
    }
}
