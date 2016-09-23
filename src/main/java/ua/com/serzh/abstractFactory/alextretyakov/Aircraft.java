package ua.com.serzh.abstractFactory.alextretyakov;

public abstract class Aircraft {
    int speed;
    int power;
    int altitude;

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

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public abstract String getDescription();
}
