package com.nhlstenden;

import java.util.ArrayList;

public class Order {
    private ArrayList<Pizza> Pizzas  = new ArrayList<Pizza>();;

    public Order() {
    }

    public void addPizza(Pizza pizza) {
        this.Pizzas.add(pizza);
    }

    public ArrayList<Pizza> getPizzas() {
        return Pizzas;
    }
}
