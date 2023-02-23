package strategy.ducks;

import strategy.behaviors.FlyNoWay;
import strategy.behaviors.Quack;
import strategy.interfaces.Duck;

import static java.lang.System.out;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        out.println("I'm a model duck");
    }
}
