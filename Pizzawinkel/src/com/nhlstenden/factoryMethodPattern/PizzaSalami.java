package com.nhlstenden.factoryMethodPattern;
import com.nhlstenden.Pizza;
public class PizzaSalami implements Pizza
{

    public String description;
    public double cost;
    private boolean isBaked;

    public PizzaSalami()
    {
        this.description = "Pizza Salami";
        this.cost = 15.0;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public boolean getBaked()
    {
        return isBaked;
    }

    public void setBaked(boolean baked) {
        this.isBaked = baked;
    }


}


