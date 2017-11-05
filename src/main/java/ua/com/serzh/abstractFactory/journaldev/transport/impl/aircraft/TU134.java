package ua.com.serzh.abstractFactory.journaldev.transport.impl.aircraft;

import ua.com.serzh.abstractFactory.journaldev.transport.interfaces.Aircraft;

public class TU134 implements Aircraft {

    @Override
    public void flight() {
        System.out.println("TU-134 flight!");
    }

    
    
}
