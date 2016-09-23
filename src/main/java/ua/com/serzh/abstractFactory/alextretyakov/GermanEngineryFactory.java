package ua.com.serzh.abstractFactory.alextretyakov;

public class GermanEngineryFactory implements EngineryFactory {

    @Override
    public Tank createTank() {
        return new E25_Tank();
    }

    @Override
    public Aircraft createAircraft() {
        return new MesserschmittBf110_Aircraft();
    }
}
