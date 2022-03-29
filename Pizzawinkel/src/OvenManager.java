import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class OvenManager implements Observer {
    ArrayList<Oven> ovens;
    ArrayList<Pizza> waitingList;
    ArrayList<Bestelling> bestellingen;


    private void addOvens() {
        Oven oven1 = new Oven();
        this.ovens.add(oven1);
    }

    public void addOrder(Bestelling bestelling) {
        this.bestellingen.add(bestelling);
        for (Pizza pizza : bestelling.getPizzas())
            if (checkIfOvenISAvaileble()) {
                Oven oven = findAvailebleOven();
                oven.addPizza(pizza);
            } else
                waitingList.add(pizza);
    }

    private Oven findAvailebleOven() {
        for (Oven oven : ovens) {
            if (!oven.isFilled())
                return oven;
        }
        return null;
    }

    private boolean checkIfOvenISAvaileble() {
        for (Oven oven : ovens) {
            if (!oven.isFilled())
                return true;
        }
        return false;
    }

    @Override
    public void update(Observable o, Object arg) {
        checkIfOrderIsReady();

        Oven oven = findAvailebleOven();
        if (this.waitingList != null) {
            oven.addPizza(waitingList.get(0));
            this.waitingList.remove(0);
        }
    }

    private void checkIfOrderIsReady() {
        for (Bestelling bestelling : bestellingen) {
            int i = 0;
            for (Pizza pizza : bestelling.getPizzas()) {
                if (pizza.getBaked() == false) {
                    i++;
                    if (i == bestelling.getPizzas().size()) {
//                        PizzaWinkel.pizzaReady(bestelling);
                    }
                }
            }
        }
    }
}
