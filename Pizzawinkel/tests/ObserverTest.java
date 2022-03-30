import com.nhlstenden.Oven;
import org.junit.jupiter.api.Test;

public class ObserverTest
{
    @Test
    void test()
    {
        Oven oven = new Oven();
        oven.isFilled();
//        OvenObserver ovenObserver = new OvenObserver();
//        ovenObserver.addObserver(oven);
//        oven.notifySubscribers();
    }
}
