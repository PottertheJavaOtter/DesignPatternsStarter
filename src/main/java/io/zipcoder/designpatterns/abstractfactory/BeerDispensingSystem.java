package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.BeerGlassDispenser;
import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.DrinkDispenser;
import io.zipcoder.designpatterns.factory.Kegerator;

/**
 * Created by minlee on 6/13/16.
 */
public class BeerDispensingSystem extends DispensingSystem {

    public DrinkDispenser drinkDispenser() {
        return new Kegerator();
    }

    public CupDispenser cupDispenser() {
        return new BeerGlassDispenser();
    }
}
