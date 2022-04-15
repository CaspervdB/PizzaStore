package com.nhlstenden.decoratorPattern;

import com.nhlstenden.Pizza;

public class KaasInKorst extends PizzaDecorator
{
    Pizza pizza;
    /**
     * Constructor voor een pizza met kaas in de korst
     * @param pizza
     */
    public KaasInKorst(Pizza pizza)
    {
        this.pizza = pizza;
    }
    /**
     * voegt "met kaas in de korst" toe aan de omschrijving van de pizza
     * @return printline met de omschrijving
     */
    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", met kaas in de korst";
    }
    /**
     * Voegt de kosten van de extra topping toe aan de pizza
     * @return double met de kosten
     */
    @Override
    public double getCost()
    {
        return pizza.getCost() + 2.50;
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

    @Override
    public void setBaked(boolean isBaked)
    {
        pizza.setBaked(isBaked);
    }
}
