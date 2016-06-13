import io.zipcoder.designpatterns.factory.Beer;
import io.zipcoder.designpatterns.factory.Drink;
import io.zipcoder.designpatterns.factory.Kegerator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by minlee on 6/13/16.
 */
public class KegeratorSpec {

    @Test
    public void dispenseTest(){
        Kegerator kegerator = new Kegerator();
        Drink beer = kegerator.dispense();
        Assert.assertTrue(beer instanceof Beer);
    }
}

