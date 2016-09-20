package ua.com.serzh.abstractFactory.tutorialspoint;

/**
 * Created by Serzh on 9/19/16.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
