package ua.com.serzh.facade.timur_batyrshinov.objects;

import ua.com.serzh.facade.timur_batyrshinov.facade.CarFacade;
import ua.com.serzh.facade.timur_batyrshinov.parts.Door;
import ua.com.serzh.facade.timur_batyrshinov.parts.Wheel;
import ua.com.serzh.facade.timur_batyrshinov.parts.Zazhiganie;

//https://www.youtube.com/watch?v=q6d2pMsDZpE&index=7&list=PLwwk4BHih4fh_aJET4PF-5Ok5iK_xgiRE
public class Client {

    public static void main(String[] args) {
        // вызов без фасада
        Door door = new Door();
        door.open();

        Zazhiganie zazhiganie = new Zazhiganie();
        zazhiganie.fire();
        
        Wheel wheel = new Wheel();
        wheel.turn();
        

        // вызов с фасадом
        CarFacade carFacade = new CarFacade();
        carFacade.go();



    }
}
