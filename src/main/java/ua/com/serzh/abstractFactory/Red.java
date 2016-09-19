package ua.com.serzh.abstractFactory;

/**
 * Created by Serzh on 9/19/16.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
