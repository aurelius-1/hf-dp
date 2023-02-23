package strategy;

import strategy.behaviors.FlyRocketPowered;
import strategy.ducks.ModelDuck;
import strategy.interfaces.Duck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
//        Duck mallard = new MallardDuck();
//        mallard.performQuack();
//        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
