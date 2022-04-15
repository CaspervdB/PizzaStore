package com.nhlstenden.decoratorPattern;

import com.nhlstenden.Pizza;

public class Ananas extends PizzaDecorator
{
    Pizza pizza;

    /**
     * Constructor voor een pizza met ananas
     * @param pizza
     */
    public Ananas(Pizza pizza)
    {
        this.pizza = pizza;
    }

    /**
     * voegt "met ananas" toe aan de omschrijving van de pizza
     * @return printline met de omschrijving
     */
    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", met ananas";
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

    /**
     * Voegt de kosten van de extra topping toe aan de pizza
     * @return double met de kosten
     */
    @Override
    public double getCost()
    {
        return pizza.getCost() + 0.50;
    }


}
