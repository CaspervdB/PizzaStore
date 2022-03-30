package com.nhlstenden.decoratorPattern;

import com.nhlstenden.Pizza;

public abstract class PizzaDecorator implements Pizza
{
    public abstract String getDescription();

    public void setDescription(String description)
    {
        setDescription(description);
    }

    public abstract double getCost();

    public void setCost(double cost)
    {
        setCost(cost);
    }

    public void setBaked(boolean isBaked)
    {
        setBaked(isBaked);
    }
}
