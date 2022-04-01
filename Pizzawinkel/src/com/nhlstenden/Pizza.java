package com.nhlstenden;

public interface Pizza
{
    String description = "Unknown pizza";
    double cost = 0.0;

    boolean isBaked = false;

    String getDescription();

    void setDescription(String description);

    double getCost();

    void setCost(double cost);

    boolean getBaked();

    void setBaked(boolean isBaked);

}
