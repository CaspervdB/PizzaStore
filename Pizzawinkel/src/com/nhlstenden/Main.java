package com.nhlstenden;

import com.nhlstenden.decoratorPattern.Ananas;
import factoryMethodPattern.PizzaSalami;

public class Main
{
    public static void main(String[] args)
    {
        Pizza pizza = new PizzaSalami();
        pizza = new Ananas(pizza);

        printPizza(pizza);
    }

    private static void printPizza(Pizza p)
    {
        System.out.println("Cost: " + p.getCost() + ", description: " + p.getDescription());
    }
}
