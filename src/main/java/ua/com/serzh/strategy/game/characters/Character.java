package ua.com.serzh.strategy.game.characters;

import ua.com.serzh.strategy.game.walk.WalkBehavior;
import ua.com.serzh.strategy.game.weapon.WeaponBehavior;

/**
 * Created by serzh on 12/28/15.
 */
public abstract class Character {
    WeaponBehavior weapon;
    WalkBehavior walkBehavior;

    public void fight() {
        System.out.print(this.getClass().getSimpleName());
        weapon.useWeapon();
        weapon.damage();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void move() {
        System.out.print(this.getClass().getSimpleName());
        walkBehavior.canMove();
    }

    public abstract void display();
}
