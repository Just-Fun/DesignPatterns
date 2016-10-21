package ua.com.serzh.observer.classic;

/**
 * Created by oleksandr.baglai on 03.09.2015.
 */
public class ConcreteObserverB implements Observer {

    @Override
    public void handleEvent(Object input) {
        System.out.println("ConcreteObserverB: " + input + "! Super!");
    }
}
