package io.zipcoder.designpatterns.factory;

/**
 * Created by minlee on 6/13/16.
 */
public class BeerGlassDispenser extends CupDispenser{

    public Cup dispenseCup() {
        return new BeerGlass();
    }
}
