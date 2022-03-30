package com.nhlstenden;

import java.util.ArrayList;

public class PizzaFactory
{

    private ArrayList<Pizza> Menu;

    public ArrayList<Pizza> createPizzas()
    {
        Menu = new ArrayList<Pizza>();

//        com.nhlstenden.Pizza Salami = new com.nhlstenden.Pizza("Salami", 15);
//        com.nhlstenden.Pizza Kebab = new com.nhlstenden.Pizza("Kebab", 15);
//        com.nhlstenden.Pizza Champignon = new com.nhlstenden.Pizza("Champignon", 15);

//        Menu.add(Salami);
//        Menu.add(Kebab);
//        Menu.add(Champignon);

        System.out.println(Menu);
        return Menu;
    }
}
