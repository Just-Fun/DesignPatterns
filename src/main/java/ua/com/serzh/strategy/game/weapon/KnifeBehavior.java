package ua.com.serzh.strategy.game.weapon;

/**
 * Created by serzh on 12/28/15.
 */
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public int damage() {
        return 2;
    }

    @Override
    public void useWeapon() {

        System.out.println(" use Knife!" + " damage " + this.damage());
    }
}
