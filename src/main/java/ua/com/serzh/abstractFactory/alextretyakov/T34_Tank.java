package ua.com.serzh.abstractFactory.alextretyakov;

public class T34_Tank extends Tank {
    private static final String NAME = "T-34";
    private static final String COUNTRY = "USSR";

    public String getDescription() {
        return NAME + " " + COUNTRY;
    }
}
