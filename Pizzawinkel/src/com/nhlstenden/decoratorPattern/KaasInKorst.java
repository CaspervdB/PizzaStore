package com.nhlstenden.decoratorPattern;

import com.nhlstenden.Pizza;

public class KaasInKorst extends PizzaDecorator
{
    Pizza pizza;

    public KaasInKorst(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", met kaas in de korst";
    }

    @Override
    public double getCost()
    {
        return pizza.getCost() + 2.50;
    }

    @Override
    public boolean getBaked()
    {
        return pizza.getBaked();
    }


}
