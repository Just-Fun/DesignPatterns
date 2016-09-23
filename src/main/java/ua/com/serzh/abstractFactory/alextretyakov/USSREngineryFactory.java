package ua.com.serzh.abstractFactory.alextretyakov;

public class USSREngineryFactory implements EngineryFactory {

    @Override
    public Tank createTank() {
        return new T34_Tank();
    }

    @Override
    public Aircraft createAircraft() {
        return new Il2_Aircraft();
    }
}
