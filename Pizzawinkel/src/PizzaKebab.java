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
