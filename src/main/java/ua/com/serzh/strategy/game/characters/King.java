package ua.com.serzh.strategy.game.characters;

import ua.com.serzh.strategy.game.walk.Ride;
import ua.com.serzh.strategy.game.weapon.SwordBehavior;

/**
 * Created by serzh on 12/28/15.
 */
public class King extends Character {

    public King(){
        weapon = new SwordBehavior();
        walkBehavior = new Ride();
    }

    @Override
    public void display() {
        System.out.println("Looks cool!");
    }
}
