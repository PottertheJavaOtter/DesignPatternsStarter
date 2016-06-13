import io.zipcoder.designpatterns.abstractfactory.CoffeeDispensingSystem;
import io.zipcoder.designpatterns.factory.CoffeeCupDispenser;
import io.zipcoder.designpatterns.factory.CoffeeMachine;
import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.DrinkDispenser;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by minlee on 6/13/16.
 */
public class CoffeeDispensingSystemSpec {

    @Test
    public void drinkDispenserSpec(){
        CoffeeDispensingSystem coffeeDispensingSystem = new CoffeeDispensingSystem();
        DrinkDispenser coffeeMachine = coffeeDispensingSystem.drinkDispenser();
        Assert.assertTrue(coffeeMachine instanceof CoffeeMachine);
    }

    @Test
    public void cupDispenserSpec(){
        CoffeeDispensingSystem coffeeDispensingSystem = new CoffeeDispensingSystem();
        CupDispenser coffeeCupDispenser = coffeeDispensingSystem.cupDispenser();
        Assert.assertTrue(coffeeCupDispenser instanceof CoffeeCupDispenser);
    }
}
