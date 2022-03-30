package factoryMethodPattern;

import com.nhlstenden.Pizza;

import java.util.ArrayList;

public class PizzaFactory {

    private ArrayList<Pizza> Order;

    public ArrayList<Pizza> createPizzas(String[] PizzaStrings ) {
        Order = new ArrayList<Pizza>();

        for(String Pizzas : PizzaStrings){
            switch(Pizzas) {
                case "Salami":
                    Pizza Salami = new PizzaSalami();
                    Order.add(Salami);
                    break;
                case "Champignon":
                    Pizza Champignon = new PizzaChampignon();
                    Order.add(Champignon);
                    break;
                case "Kebab":
                    Pizza Kebab = new PizzaKebab();
                    Order.add(Kebab);
                    break;
                default:
                    // code block
            }
        }

        return Order;
    }
}
