package com.nhlstenden;

public interface Pizza
{
    String beschrijving = "Unknown pizza";
    double prijs = 0.0;

    boolean isGebakken = false;

    String getBeschrijving();

    void setBeschrijving();

    int getPrijs();

    void setPrijs();

    boolean getBaked();

    void setBaked();

}
