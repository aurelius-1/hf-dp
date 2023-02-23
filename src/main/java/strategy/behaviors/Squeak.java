package strategy.behaviors;

import strategy.interfaces.QuackBehavior;

import static java.lang.System.out;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        out.println("Squeak");
    }
}
