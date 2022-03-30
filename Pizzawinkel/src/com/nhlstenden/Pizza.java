package com.nhlstenden;

public interface Pizza
{
    String beschrijving = "Unknown pizza";
    double prijs = 0.0;

    boolean isBaked = false;

    String getDescription();

    void setDescription();

    int getCost();

    void setCost();

    boolean getBaked();

    void setBaked();

}
