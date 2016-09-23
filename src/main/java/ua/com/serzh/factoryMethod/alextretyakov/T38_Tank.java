package ua.com.serzh.factoryMethod.alextretyakov;

public class T38_Tank implements Tank {
    private static final String NAME = "T-38";
    private static final String COUNTRY = "USSR";

    public String getDescription() {
        return NAME + " " + COUNTRY;
    }
}
