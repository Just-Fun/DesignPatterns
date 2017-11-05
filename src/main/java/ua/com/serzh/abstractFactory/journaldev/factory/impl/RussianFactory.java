package ua.com.serzh.abstractFactory.journaldev.factory.impl;

import ua.com.serzh.abstractFactory.journaldev.factory.interfaces.TransportFactory;
import ua.com.serzh.abstractFactory.journaldev.transport.impl.aircraft.TU134;
import ua.com.serzh.abstractFactory.journaldev.transport.impl.car.Niva;
import ua.com.serzh.abstractFactory.journaldev.transport.interfaces.Aircraft;
import ua.com.serzh.abstractFactory.journaldev.transport.interfaces.Car;

// российские транспортные средства
public class RussianFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }

}
