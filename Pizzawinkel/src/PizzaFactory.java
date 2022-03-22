import sun.rmi.runtime.Log;

import java.util.ArrayList;

public class PizzaFactory {

    private ArrayList<Pizza> Menu;

    public ArrayList<Pizza> createPizzas(){
         Menu = new ArrayList<Pizza>();

        Pizza Salami = new Pizza("Salami", 15);
        Pizza Kebab = new Pizza("Kebab", 15);
        Pizza Champignon = new Pizza("Champignon", 15);

        Menu.add(Salami);
        Menu.add(Kebab);
        Menu.add(Champignon);

        System.out.println(Menu);
        return Menu;
        }
    }
