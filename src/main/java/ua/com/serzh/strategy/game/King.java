package ua.com.serzh.strategy.game;

/**
 * Created by serzh on 12/28/15.
 */
public class King extends Character {

    public King(){
        weapon = new SwordBehavior();

    }

    @Override
    public void display() {
        System.out.println("Выглядит круто!");
    }
}
