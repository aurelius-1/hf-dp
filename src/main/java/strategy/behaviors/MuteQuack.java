package strategy.behaviors;

import strategy.interfaces.QuackBehavior;

import static java.lang.System.out;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        out.print("<< Silence >>");
    }
}
