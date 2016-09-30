package ua.com.serzh.strategy.baglai.inheritance;

/**
 * Created by oleksandr.baglai on 02.09.2015.
 */
public class ConcreteStrategyC extends Strategy {
    @Override
    public Object algorithm(Object input) {
        return String.format("class:%s", input.getClass().getSimpleName());
    }
}
