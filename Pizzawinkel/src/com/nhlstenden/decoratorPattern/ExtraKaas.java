package com.nhlstenden.decoratorPattern;

import com.nhlstenden.Pizza;

public class ExtraKaas extends PizzaDecorator
{
    Pizza pizza;
    /**
     * Constructor voor een pizza met extra kaas
     * @param pizza
     */
    public ExtraKaas(Pizza pizza)
    {
        this.pizza = pizza;
    }
    /**
     * voegt "met extra kaas" toe aan de omschrijving van de pizza
     * @return printline met de omschrijving
     */
    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", met extra kaas";
    }
    /**
     * Voegt de kosten van de extra topping toe aan de pizza
     * @return double met de kosten
     */
    @Override
    public double getCost()
    {
        return pizza.getCost() + 1.0;
    }
    /**
     * bak status van de pizza
     * @return boolean getBaked
     */
    @Override
    public boolean getBaked()
    {
        return pizza.getBaked();
    }
}
