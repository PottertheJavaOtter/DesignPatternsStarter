import io.zipcoder.designpatterns.factory.BeerGlass;
import io.zipcoder.designpatterns.factory.BeerGlassDispenser;
import io.zipcoder.designpatterns.factory.Cup;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by minlee on 6/13/16.
 */
public class BeerGlassDispenserSpec {

    @Test
    public void dispenseCupTest(){
        BeerGlassDispenser beerGlassDispenser = new BeerGlassDispenser();
        Cup beerGlass = beerGlassDispenser.dispenseCup();
        assertTrue(beerGlass instanceof BeerGlass);
    }
}
