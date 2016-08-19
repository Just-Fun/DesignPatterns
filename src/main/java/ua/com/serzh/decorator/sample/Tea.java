package ua.com.serzh.decorator.sample;

/**
 * Created by oleksandr.baglai on 26.08.2015.
 */
public class Tea extends Beverage {

    @Override
    public int cost() {
        return 17;
    }

    @Override
    public String description() {
        return "Tea";
    }
}
