import java.util.ArrayList;

public class PizzaWinkel {
    ArrayList<Bestelling> Bestellingen;
     PizzaFactory fabriek = new PizzaFactory();
     OvenManager ovenManager = new OvenManager();
    ArrayList<Pizza> StandaardPizzas = fabriek.createPizzas();

    public void newOrder(Bestelling bestelling)
    {
        ovenManager.addOrder(bestelling);
    }
}
