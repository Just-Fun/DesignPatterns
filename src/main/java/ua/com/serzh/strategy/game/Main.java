package ua.com.serzh.strategy.game;

import ua.com.serzh.strategy.game.characters.Character;
import ua.com.serzh.strategy.game.characters.King;
import ua.com.serzh.strategy.game.characters.Queen;
import ua.com.serzh.strategy.game.weapon.KnifeBehavior;
import ua.com.serzh.strategy.game.weapon.SwordBehavior;

/**
 * Created by serzh on 12/28/15.
 */
public class Main {

    public static void main(String[] args) {

        Character king = new King();
        king.fight();
        king.setWeapon(new KnifeBehavior());
        king.fight();
        king.move();
        king.display();

        System.out.println();
        Character queen = new Queen();
        queen.fight();
        queen.setWeapon(new SwordBehavior());
        queen.fight();
        queen.move();
        queen.display();

    }
}
