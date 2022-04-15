package com.nhlstenden;

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
    {   //Aanmaken van PizzaWinkel
        PizzaWinkel martini = new PizzaWinkel();

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


        //Nieuwe bestelling maken
        Order bestellingEen = new Order();
        bestellingEen.addPizza(pizzaKebab);
        bestellingEen.addPizza(pizzaFungi);
        bestellingEen.addPizza(pizzaKebab);
        bestellingEen.addPizza(pizzaMargaritha);
        martini.newOrder(bestellingEen);


    }
}
