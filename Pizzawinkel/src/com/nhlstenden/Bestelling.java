package com.nhlstenden;

import java.util.ArrayList;

public class Bestelling {
    private ArrayList<Pizza> Pizzas  = new ArrayList<Pizza>();;

    public Bestelling() {
    }

    public void addPizza(Pizza pizza) {
        this.Pizzas.add(pizza);
    }

    public ArrayList<Pizza> getPizzas() {
        return Pizzas;
    }
}
