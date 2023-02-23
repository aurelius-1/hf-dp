package strategy.behaviors;

import strategy.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly with wings!");
    }
}
