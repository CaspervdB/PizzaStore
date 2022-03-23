

import java.util.ArrayList;

public class PizzaWinkel {
    ArrayList<Bestelling> Bestellingen;
     PizzaFactory fabriek = new PizzaFactory();
    ArrayList<Pizza> StandaardPizzas = fabriek.createPizzas();
}
