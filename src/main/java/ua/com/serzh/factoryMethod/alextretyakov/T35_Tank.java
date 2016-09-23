package ua.com.serzh.factoryMethod.alextretyakov;

public class T35_Tank implements Tank {
    private static final String NAME = "T-35";
    private static final String COUNTRY = "USSR";

    public String getDescription() {
        return NAME + " " + COUNTRY;
    }
}
