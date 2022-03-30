import java.util.ArrayList;
import Pizzas.Pizza;

public class Bestelling {
    private ArrayList<Pizza> Pizzas;

    public void addPizzas(Pizza pizza) {
        this.Pizzas.add(pizza);
    }

    public ArrayList<Pizza> getPizzas() {
        return Pizzas;
    }
}
