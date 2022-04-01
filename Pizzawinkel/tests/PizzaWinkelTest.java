import com.nhlstenden.Order;
import com.nhlstenden.OvenManager;
import com.nhlstenden.Pizza;
import com.nhlstenden.PizzaWinkel;

import org.junit.jupiter.api.Test;

class PizzaWinkelTest {

    @Test
    void StandaardTest() {
        PizzaWinkel Martini = new PizzaWinkel();
        OvenManager ovenManager = new OvenManager();
        ovenManager.addObserver(Martini);
        Order lijst = new Order();
        Pizza pizzaSalami = Martini.createPizza("Salami");
        // bestelling

//        pizzaSalami = new ExtraKaas(PizzaSalami);
//        pizzaSalami = new KaasInKorst(PizzaSalami);
//        Pizza pizza1 = Martini();

        lijst.addPizza(pizzaSalami);
        Martini.newOrder(lijst);


//        Beverage beverage2 = new DarkRoast();
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Whip(beverage2);
//        System.out.println(beverage2.getDescription()
//                + “ $” + beverage2.cost());
//        Martini.bestelPizza("Salami");

    }
}
