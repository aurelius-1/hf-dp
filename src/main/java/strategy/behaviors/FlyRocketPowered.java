package strategy.behaviors;

import strategy.interfaces.FlyBehavior;

import static java.lang.System.out;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        out.println("I'm flying with a rocket");
    }
}
