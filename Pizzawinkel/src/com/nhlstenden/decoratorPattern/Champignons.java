package com.nhlstenden.decoratorPattern;

import com.nhlstenden.Pizza;

public class Champignons extends PizzaDecorator
{
    Pizza pizza;

    public Champignons(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", met Champignons";
    }


    @Override
    public boolean getBaked()
    {
        return pizza.getBaked();
    }


    @Override
    public double getCost()
    {
        return pizza.getCost() + 0.50;
    }

}
