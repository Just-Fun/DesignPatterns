package ua.com.serzh.strategy.game.walk;

/**
 * Created by serzh on 2/5/16.
 */
public class Walk implements WalkBehavior {
    @Override
    public void canMove() {
        System.out.println(" can Walk");
    }
}
