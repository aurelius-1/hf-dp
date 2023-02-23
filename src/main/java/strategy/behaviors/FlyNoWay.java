package strategy.behaviors;

import strategy.interfaces.FlyBehavior;

import static java.lang.System.out;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        out.println("I can t fly");
    }
}
