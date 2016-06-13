import io.zipcoder.designpatterns.factory.CoffeeCup;
import io.zipcoder.designpatterns.factory.CoffeeCupDispenser;
import io.zipcoder.designpatterns.factory.Cup;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by minlee on 6/13/16.
 */
public class CoffeeCupDispenserSpec {

    @Test
    public void dispenseCupTest(){
        CoffeeCupDispenser coffeeCupDispenser = new CoffeeCupDispenser();
        Cup coffeeCup = coffeeCupDispenser.dispenseCup();
        Assert.assertTrue(coffeeCup instanceof CoffeeCup);
    }
}
