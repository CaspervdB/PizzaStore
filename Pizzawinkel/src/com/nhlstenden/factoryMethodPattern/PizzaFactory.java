package com.nhlstenden.factoryMethodPattern;
//import factoryMethodPattern.PizzaChampignon;
//import com.nhlstenden.factoryMethodPattern.PizzaKebab;
//import factoryMethodPattern.PizzaMargaritha;
//import com.nhlstenden.factoryMethodPattern.PizzaSalami;

import com.nhlstenden.Pizza;


public class PizzaFactory {
    public Pizza createPizzas(String Pizza) {
        Pizza pizza = new PizzaMargaritha();
        switch (Pizza) {
            case "Salami":
                pizza = new PizzaSalami();
//                Order.add(Salami);
                break;
            case "Champignon":
                pizza = new PizzaChampignon();
//                Order.add(Champignon);
                break;
            case "Kebab":
                pizza = new PizzaChampignon();
//                Order.add(Kebab);
                break;
            default:
                // code block
        }
//        System.out.println(Menu);
        return pizza;
    }
}