package com.nhlstenden.decoratorPattern;

import com.nhlstenden.Pizza;

public abstract class PizzaDecorator implements Pizza
{
    /**
     * Abstracte methode voor het opvragen van een omschrijving
     * @return String omschrijving
     */
    public abstract String getDescription();

    /**
     * Abstracte methode voor het opvragen van de kosten van een pizza
     * @return double kosten
     */
    public abstract double getCost();

    /**
     * Zet de omschrijving van een pizza
     * @param description
     */
    public void setDescription(String description)
    {
        setDescription(description);
    }

    /**
     * Zet de prijs van een pizza
     * @param cost
     */
    public void setCost(double cost)
    {
        setCost(cost);
    }

    /**
     * Zet de bak status van een pizza met een boolean
     * @param isBaked
     */
    public void setBaked(boolean isBaked)
    {
        setBaked(isBaked);
    }
}
