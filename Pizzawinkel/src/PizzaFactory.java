

import Pizzas.Champignon;
import Pizzas.Kebab;
import Pizzas.Salami;
import Pizzas.Pizza;

import java.util.ArrayList;

public class PizzaFactory {

    private ArrayList<Pizza> Menu;

    public ArrayList<Pizza> createPizzas() {
        Menu = new ArrayList<Pizza>();

        Pizza Salami = new Salami();
        Pizza Kebab = new Kebab();
        Pizza Champignon = new Champignon();

        Menu.add(Salami);
        Menu.add(Kebab);
        Menu.add(Champignon);

        System.out.println(Menu);
        return Menu;
    }
}
