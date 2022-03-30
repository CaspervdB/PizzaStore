package com.nhlstenden.decoratorPattern;

import com.nhlstenden.Pizza;

public class Ananas extends PizzaDecorator
{
    Pizza pizza;

    public Ananas(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", met ananas";
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
