package ua.com.serzh.strategy.baglai.classic;

/**
 * Created by oleksandr.baglai on 02.09.2015.
 */
public class ConcreteStrategyC implements Strategy {
    @Override
    public Object algorithm(Object input) {
        return String.format("class:%s", input.getClass().getSimpleName());
    }
}
