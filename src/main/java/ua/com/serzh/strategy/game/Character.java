package ua.com.serzh.strategy.game;

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

    public void walk() {
        System.out.print(this.getClass().getSimpleName());
        walkBehavior.canWalk();
    }

    public abstract void display();
}
