import io.zipcoder.designpatterns.factory.Drink;
import io.zipcoder.designpatterns.factory.Soda;
import io.zipcoder.designpatterns.factory.SodaMachine;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by minlee on 6/13/16.
 */
public class SodaMachineSpec {

    @Test
    public void dispenseTest(){
        SodaMachine sodaMachine = new SodaMachine();
        Drink soda = sodaMachine.dispense();
        Assert.assertTrue(soda instanceof Soda);
    }
}
