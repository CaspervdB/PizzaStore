package com.nhlstenden;

public interface Pizza
{
    String description = "Unknown pizza";
    double cost = 0.0;

    boolean isBaked = false;

    String getDescription();

    void setDescription();

    double getCost();

    void setCost();

    boolean getBaked();

    void setBaked();

}
