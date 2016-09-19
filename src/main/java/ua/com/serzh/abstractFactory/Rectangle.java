package ua.com.serzh.abstractFactory;

/**
 * Created by Serzh on 9/19/16.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
