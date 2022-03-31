package com.nhlstenden.decoratorPattern;

import com.nhlstenden.Pizza;

public class ExtraKaas extends PizzaDecorator
{
    Pizza pizza;

    public ExtraKaas(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", met extra kaas";
    }

    @Override
    public double getCost()
    {
        return pizza.getCost() + 1.0;
    }

    @Override
    public boolean getBaked()
    {
        return pizza.getBaked();
    }
}
