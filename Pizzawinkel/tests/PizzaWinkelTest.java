import com.nhlstenden.Bestelling;
import com.nhlstenden.Pizza;
import com.nhlstenden.PizzaWinkel;

import factoryMethodPattern.PizzaSalami;
import org.junit.jupiter.api.Test;

class PizzaWinkelTest
{

    @Test
    void StandaardTest()
    {
        PizzaWinkel Martini = new PizzaWinkel();
        Pizza pizzaSalami = Martini.createPizza("Salami");
        // bestelling

//        pizzaSalami = new ExtraKaas(PizzaSalami);
//        pizzaSalami = new KaasInKorst(PizzaSalami);
//        Pizza pizza1 = Martini();



//        Beverage beverage2 = new DarkRoast();
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Whip(beverage2);
//        System.out.println(beverage2.getDescription()
//                + “ $” + beverage2.cost());
//        Martini.bestelPizza("Salami");

    }
}
