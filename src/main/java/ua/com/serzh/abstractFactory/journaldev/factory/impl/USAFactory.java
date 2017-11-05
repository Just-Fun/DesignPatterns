package ua.com.serzh.abstractFactory.journaldev.factory.impl;

import ua.com.serzh.abstractFactory.journaldev.factory.interfaces.TransportFactory;
import ua.com.serzh.abstractFactory.journaldev.transport.impl.aircraft.Boeing747;
import ua.com.serzh.abstractFactory.journaldev.transport.impl.car.Porsche;
import ua.com.serzh.abstractFactory.journaldev.transport.interfaces.Aircraft;
import ua.com.serzh.abstractFactory.journaldev.transport.interfaces.Car;

// американские транспортные средства
public class USAFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }

}
