package Pizzas;

public class Kebab implements Pizzas.Pizza{
    public String beschrijving;
    public int prijs;

    private boolean isGebakken;

    public Kebab() {
        this.beschrijving = "Io sono la pizza kebab";//The pizzas speak Italian;
        this.prijs = 14;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public int getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public boolean getBaked() {
        return isGebakken;
    }

    public void setBaked(boolean baked) {
        this.isGebakken = baked;
    }
}