package ua.com.serzh.abstractFactory.journaldev.start;

import ua.com.serzh.abstractFactory.journaldev.factory.impl.RussianFactory;
import ua.com.serzh.abstractFactory.journaldev.factory.impl.USAFactory;
import ua.com.serzh.abstractFactory.journaldev.factory.interfaces.TransportFactory;

public class Start {
    
    private static TransportFactory factory;
    
    public static void main(String[] args) {
      
        if (true){
            factory = new RussianFactory();
        }else{
            factory = new USAFactory();
        }
        
        
        factory.createAircraft();
        factory.createCar();
        
        
    }

}
