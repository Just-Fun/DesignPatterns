package ua.com.serzh.memento_Token_Snapshot.alextretyakov;

public class Tank {
    private int speed;
    private int power;

    public Tank(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    private class TankMemento {
        private int speedState;
        private int powerState;

        private TankMemento(int speedState, int powerState) {
            this.speedState = speedState;
            this.powerState = powerState;
        }
    }

    public Object getMemento() {
        return new TankMemento(speed, power);
    }

    public void setMemento(Object object) {
        if (object instanceof TankMemento) {
            TankMemento memento = (TankMemento) object;

            speed = memento.speedState;
            power = memento.powerState;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDescription() {
        return "Speed is " + speed + " km/h, power is " + power;
    }
}