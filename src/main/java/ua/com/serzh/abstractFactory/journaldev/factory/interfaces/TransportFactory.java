package ua.com.serzh.abstractFactory.journaldev.factory.interfaces;

import ua.com.serzh.abstractFactory.journaldev.transport.interfaces.Aircraft;
import ua.com.serzh.abstractFactory.journaldev.transport.interfaces.Car;

// фабрика по созданию транспортных средств
public interface TransportFactory {
    
    // что фабрика будет производить
    
    Car createCar();// автомобили
    
    Aircraft createAircraft(); // самолеты

}
