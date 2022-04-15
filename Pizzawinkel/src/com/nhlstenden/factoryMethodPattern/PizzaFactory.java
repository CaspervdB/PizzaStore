package com.nhlstenden.factoryMethodPattern;

import com.nhlstenden.Pizza;


public class PizzaFactory {
    public Pizza createPizzas(String Pizza) {
        Pizza pizza = new PizzaMargaritha();
        switch (Pizza) {
            case "Salami":
                pizza = new PizzaSalami();
                break;
            case "Champignon":
                pizza = new PizzaChampignon();
                break;
            case "Kebab":
                pizza = new PizzaKebab();
                break;
            case "Margaritha":
                pizza = new PizzaMargaritha();
                break;
            default:
        }
        return pizza;
    }
}
