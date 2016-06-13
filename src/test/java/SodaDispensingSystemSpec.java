import io.zipcoder.designpatterns.abstractfactory.SodaDispensingSystem;
import io.zipcoder.designpatterns.factory.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by minlee on 6/13/16.
 */
public class SodaDispensingSystemSpec {

    @Test
    public void drinkDispenserSpec(){
        SodaDispensingSystem sodaDispensingSystem = new SodaDispensingSystem();
        DrinkDispenser sodaMachine = sodaDispensingSystem.drinkDispenser();
        Assert.assertTrue(sodaMachine instanceof SodaMachine);
    }
    @Test
    public void cupDispenserSpec(){
        SodaDispensingSystem sodaDispensingSystem = new SodaDispensingSystem();
        CupDispenser sodaCupDispenser = sodaDispensingSystem.cupDispenser();
        Assert.assertTrue(sodaCupDispenser instanceof SodaCupDispenser);
    }
}
