package factoryMethodPattern;

import com.nhlstenden.Pizza;

public class PizzaKebab implements Pizza {
    public String beschrijving;
    public int prijs;
    private boolean isGebakken;

    public PizzaKebab() {
        this.beschrijving = "Pizza Salami";
        this.prijs = 15;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    @Override
    public void setBeschrijving() {

    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public int getPrijs() {
        return prijs;
    }

    @Override
    public void setPrijs() {

    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }


    public boolean getBaked() {
        return isGebakken;
    }

    @Override
    public void setBaked() {

    }

    public void setBaked(boolean baked) {
        this.isGebakken = baked;
    }
}
