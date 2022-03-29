import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObserverTest
{
    @Test
    void test ()
    {
        Oven oven = new Oven();
        oven.isFilled();
//        OvenObserver ovenObserver = new OvenObserver();
//        ovenObserver.addObserver(oven);
//        oven.notifySubscribers();
    }
}
