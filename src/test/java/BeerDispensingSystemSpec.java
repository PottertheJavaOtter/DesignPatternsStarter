import io.zipcoder.designpatterns.abstractfactory.BeerDispensingSystem;
import io.zipcoder.designpatterns.factory.BeerGlassDispenser;
import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.DrinkDispenser;
import io.zipcoder.designpatterns.factory.Kegerator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by minlee on 6/13/16.
 */
public class BeerDispensingSystemSpec {

    @Test
    public void drinkDispenserSpec(){
        BeerDispensingSystem beerDispensingSystem = new BeerDispensingSystem();
        DrinkDispenser kegerator = beerDispensingSystem.drinkDispenser();
        Assert.assertTrue(kegerator instanceof Kegerator);
    }
    @Test
    public void cupDispenserSpec(){
        BeerDispensingSystem beerDispensingSystem = new BeerDispensingSystem();
        CupDispenser beerGlassDispenser = beerDispensingSystem.cupDispenser();
        Assert.assertTrue(beerGlassDispenser instanceof BeerGlassDispenser);
    }
}
