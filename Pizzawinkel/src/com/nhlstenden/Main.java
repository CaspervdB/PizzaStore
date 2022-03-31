package com.nhlstenden;

import com.nhlstenden.decoratorPattern.Ananas;
import com.nhlstenden.decoratorPattern.ExtraKaas;
import com.nhlstenden.decoratorPattern.KaasInKorst;
import com.nhlstenden.factoryMethodPattern.PizzaSalami;

public class Main
{
    public static void main(String[] args)
    {
        Pizza pizza = new PizzaSalami();
        pizza = new Ananas(pizza);
        pizza = new ExtraKaas(pizza);
        pizza = new KaasInKorst(pizza);

        printPizza(pizza);
    }

    private static void printPizza(Pizza p)
    {
        System.out.println("Cost: " + p.getCost() + ", description: " + p.getDescription());
    }
}
