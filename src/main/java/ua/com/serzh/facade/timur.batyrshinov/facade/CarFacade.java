package ua.com.serzh.facade.timur.batyrshinov.facade;

// фасад для работы 

import ua.com.serzh.facade.timur.batyrshinov.parts.Door;
import ua.com.serzh.facade.timur.batyrshinov.parts.Wheel;
import ua.com.serzh.facade.timur.batyrshinov.parts.Zazhiganie;

public class CarFacade {

    private Door door = new Door();
    private Zazhiganie zazhiganie = new Zazhiganie();
    private Wheel wheel = new Wheel();

    public void go(){
        door.open();
        zazhiganie.fire();
        wheel.turn();
    }
    
        
    
}
