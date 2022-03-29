

public class Pizza {
    public String beschrijving;
    public int prijs;

    private boolean isGebakken;

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

    public Pizza(String beschrijving, int prijs) {
        this.beschrijving = beschrijving;
        this.prijs = prijs;
    }

    public boolean getBaked() {
        return isGebakken;
    }

    public void setBaked(boolean baked) {
        this.isGebakken = baked;
    }

}
