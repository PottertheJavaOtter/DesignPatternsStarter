import io.zipcoder.designpatterns.factory.Cup;
import io.zipcoder.designpatterns.factory.SodaCup;
import io.zipcoder.designpatterns.factory.SodaCupDispenser;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by minlee on 6/13/16.
 */
public class SodaCupDispenserSpec {

    @Test
    public void dispenseCupTest(){
        SodaCupDispenser sodaCupDispenser = new SodaCupDispenser();
        Cup sodaCup = sodaCupDispenser.dispenseCup();
        Assert.assertTrue(sodaCup instanceof SodaCup);
    }
}
