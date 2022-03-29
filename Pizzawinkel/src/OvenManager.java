import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class OvenManager implements Observer
{
    ArrayList<Oven> ovens;
    ArrayList<Pizza> waitingList;
    ArrayList<Bestelling> bestellingen;


    private void addOvens()
    {
        Oven oven1 = new Oven();
        this.ovens.add(oven1);
    }

    public void addOrder(Bestelling bestelling)
    {
        this.bestellingen.add(bestelling);
        for (Pizza pizza : bestelling.getPizzas())
            if (checkIfOvenISAvaileble())
            {
                oven = findAvailebleOven();
                oven.addPizza(pizza);
            }
            else
                waitingList.add(pizza);
    }

    private Oven findAvailebleOven()
    {
        for(Oven oven : ovens)
        {
            if (!oven.isFilled())
                return oven;
        }
        return None;
    }

    private boolean checkIfOvenISAvaileble()
    {
        for(Oven oven : ovens)
        {
            if (!oven.isFilled())
                return true;
        }
        return false;
    }

    @Override
    public void update(Observable o, Object arg)
    {
        checkIfOrderIsReady();

        oven = findAvailebleOven();
        if (this.waitingList != emtpy)
        {
            oven.addPizza(this.waitingList(0));
            this.waitingList.remove(0);
        }
    }

    private void checkIfOrderIsReady()
    {
        for(Bestelling bestelling : bestellingen)
        {
            for (Pizza pizza : bestelling.getPizzas())
            {
                if (pizza.getBaked() == false)

            }
        }
    }
}
