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
    public void setDescription()
    {

    }

    @Override
    public int getCost()
    {
        return 0;
    }

    @Override
    public void setCost()
    {

    }

    @Override
    public boolean getBaked()
    {
        return false;
    }

    @Override
    public void setBaked()
    {

    }

    @Override
    public double cost()
    {
        return pizza.getCost() + 1.0;
    }
}