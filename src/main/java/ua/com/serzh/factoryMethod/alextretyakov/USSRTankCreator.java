package ua.com.serzh.factoryMethod.alextretyakov;

public class USSRTankCreator implements TankCreator {

    @Override
    public Tank getTank(String name) {
        if ("T-34".equals(name)) {
            return new T34_Tank();
        } else if ("T-35".equals(name)) {
            return new T35_Tank();
        } else if ("T-38".equals(name)) {
            return new T38_Tank();
        }

        return null;
    }
}
