package ua.com.serzh.memento_Token_Snapshot.alextretyakov;

//http://alextretyakov.blogspot.com/2012/04/shablon-memento.html
public class MementoDemo {

    public static void main(String[] atgs) {
        Tank tank = new Tank(50, 50);
        System.out.println("Initial tank description:");
        System.out.println(tank.getDescription() + "\n");

        Object memento = tank.getMemento();

        tank.setSpeed(25);
        tank.setPower(25);
        System.out.println("New tank description:");
        System.out.println(tank.getDescription() + "\n");

        tank.setMemento(memento);

        System.out.println("Restored tank description:");
        System.out.println(tank.getDescription());
    }
}