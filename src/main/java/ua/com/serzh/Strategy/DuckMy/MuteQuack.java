package ua.com.serzh.Strategy.DuckMy;

/**
 * Created by serzh on 12/11/15.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
