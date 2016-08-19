package ua.com.serzh.decorator.sample;

/**
 * Created by oleksandr.baglai on 26.08.2015.
 */
public class Coffee extends Beverage {

    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String description() {
        return "Coffee";
    }
}
