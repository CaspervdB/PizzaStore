import java.util.Observable;

public class Oven extends Observable
{
    private Pizza pizza;
    private boolean isBaking;

    public void notifySubscribers()
    {
        notifyObservers();
        //Als er iets in de oven wordt geupdate, ziet de ovenObserver dat
    }

    public void addPizza(Pizza pizza)
    {
        this.pizza = pizza;
        this.isBaking = true;
        startTimer();
    }

    private void startTimer()
    {
        //Hier moet een timer komen
        pizzaIsReady();
    }

    private void pizzaIsReady()
    {
        this.isBaking = false;
        notifySubscribers();
    }

    public boolean isFilled()
    {
        return isBaking;
    }
}
