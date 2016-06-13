import io.zipcoder.designpatterns.factory.Coffee;
import io.zipcoder.designpatterns.factory.CoffeeMachine;
import io.zipcoder.designpatterns.factory.Drink;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by minlee on 6/13/16.
 */
public class CoffeeMachineSpec {

    @Test
    public void dispenseTest(){
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Drink coffee = coffeeMachine.dispense();
        Assert.assertTrue(coffee instanceof Coffee);
    }
}
