import java.util.Observable;

public class Oven extends Observable
{
    public void notifySubscribers()
    {
        notifyObservers();
        //Als er iets in de oven wordt geupdate, ziet de ovenObserver dat
    }
}
