package ua.com.serzh.strategy.duck;

/**
 * Created by serzh on 2/5/16.
 */
public class Main {

    public static void main(String[] args) {

        Duck redDuck = new RedHeadDuck();
        redDuck.display();
        redDuck.swim();
        redDuck.performFly();
        redDuck.performQuack();
        redDuck.setQuackBehavior(new Squeak());
        redDuck.performQuack();
    }
}
