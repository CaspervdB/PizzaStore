import java.util.ArrayList;

public class PizzaWinkel {
    ArrayList<Bestelling> Bestellingen;
    PizzaFactory fabriek = new PizzaFactory();
    OvenManager ovenManager = new OvenManager();
    String[] pizzaList = new String[]{"Salami", "Kebab", "Champignon"};
    ArrayList<Pizza> StandaardPizzas = fabriek.createPizzas(pizzaList);

    public void newOrder(Bestelling bestelling) {
        ovenManager.addOrder(bestelling);
//        ovenManager.getWaitTime();
    }


    public void PizzaReady(Bestelling bestelling) {
        Bestellingen.add(bestelling);
    }
}
