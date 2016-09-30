package ua.com.serzh.strategy.game;

/**
 * Created by serzh on 12/28/15.
 */
public class Queen extends Character {
    public Queen() {
        weapon = new KnifeBehavior();
        walkBehavior = new Walk();
    }


    @Override
    public void display() {
        System.out.println("Красива!");
    }
}
