package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.*;


public class CoffeeDispensingSystem extends DispensingSystem{
    public DrinkDispenser drinkDispenser(){ return new CoffeeMachine(); }

    //Uncomment after part 1 is done
    public CupDispenser cupDispenser(){
        return new CoffeeCupDispenser();
    }

}
