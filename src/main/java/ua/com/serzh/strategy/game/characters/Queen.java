package ua.com.serzh.strategy.game.characters;

import ua.com.serzh.strategy.game.characters.Character;
import ua.com.serzh.strategy.game.walk.Walk;
import ua.com.serzh.strategy.game.weapon.KnifeBehavior;

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
        System.out.println("Looks beautiful!");
    }
}
