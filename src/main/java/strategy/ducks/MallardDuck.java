package strategy.ducks;

import strategy.behaviors.FlyWithWings;
import strategy.behaviors.Quack;
import strategy.interfaces.Duck;

import static java.lang.System.out;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        out.println("I'm a real Mallard duck");
    }
}
