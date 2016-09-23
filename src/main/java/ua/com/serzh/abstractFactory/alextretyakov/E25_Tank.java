package ua.com.serzh.abstractFactory.alextretyakov;

public class E25_Tank extends Tank {
    private static final String NAME = "E-25";
    private static final String COUNTRY = "Germany";

    public String getDescription() {
        return NAME + " " + COUNTRY;
    }
}
