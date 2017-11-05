package ua.com.serzh.abstractFactory.journaldev.transport.impl.car;

import ua.com.serzh.abstractFactory.journaldev.transport.interfaces.Car;

public class Niva implements Car {

    @Override
    public void drive() {
        System.out.println("Niva drive");
    }

    @Override
    public void stop() {
        System.out.println("Niva stopped");
    }
    
}
