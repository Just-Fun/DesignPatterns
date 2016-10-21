package ua.com.serzh.observer.classic;

/**
 * Created by oleksandr.baglai on 03.09.2015.
 */
public class ConcreteObserverA implements Observer {

    @Override
    public void handleEvent(Object input) {
        System.out.println("ConcreteObserverA: " + input);
    }

    // some code here
}
