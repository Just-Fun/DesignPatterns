package ua.com.serzh.abstractFactory.alextretyakov;

public class MesserschmittBf110_Aircraft extends Aircraft {
    private static final String NAME = "Messerschmitt Bf.110";
    private static final String COUNTRY = "Germany";

    public String getDescription() {
        return NAME + " " + COUNTRY;
    }
}
