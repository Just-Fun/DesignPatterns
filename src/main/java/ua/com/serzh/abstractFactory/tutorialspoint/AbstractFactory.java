package ua.com.serzh.abstractFactory.tutorialspoint;

/**
 * Created by Serzh on 9/19/16.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
