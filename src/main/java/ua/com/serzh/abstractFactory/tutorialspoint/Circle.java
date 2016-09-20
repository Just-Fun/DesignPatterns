package ua.com.serzh.abstractFactory.tutorialspoint;

/**
 * Created by Serzh on 9/19/16.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
