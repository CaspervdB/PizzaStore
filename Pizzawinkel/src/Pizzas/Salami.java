package Pizzas;

public class Salami implements Pizzas.Pizza{
    public String beschrijving;
    public int prijs;

    private boolean isGebakken;

    public Salami() {
        this.beschrijving = "Io sono la pizza salami";//The pizzas speak Italian;
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

    @Override
    public String getDescription()
    {
        return null;
    }

    @Override
    public void setDescription(String description)
    {

    }

    @Override
    public double getCost()
    {
        return 0;
    }

    @Override
    public void setCost(double cost)
    {

    }

    public boolean getBaked() {
        return isGebakken;
    }

    public void setBaked(boolean baked) {
        this.isGebakken = baked;
    }
}
