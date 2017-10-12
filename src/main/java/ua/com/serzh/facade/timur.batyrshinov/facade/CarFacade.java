package ua.com.serzh.facade.timur.batyrshinov.facade;

import ua.com.serzh.facade.timur.batyrshinov.parts.Door;
import ua.com.serzh.facade.timur.batyrshinov.parts.Wheel;
import ua.com.serzh.facade.timur.batyrshinov.parts.Zazhiganie;

// фасад для работы
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
