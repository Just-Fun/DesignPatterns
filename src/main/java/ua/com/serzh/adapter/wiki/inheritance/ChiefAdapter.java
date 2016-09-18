package ua.com.serzh.adapter.wiki.inheritance;

/**
 * Created by Serzh on 9/18/16.
 */
public class ChiefAdapter implements Chief{
    private Plumber plumber = new Plumber();

    @Override
    public Object makeBreakfast() {
        return plumber.getKey();
    }

    @Override
    public Object makeDinner() {
        return plumber.getScrewDriver();
    }

    @Override
    public Object makeSupper() {
        return plumber.getPipe();
    }
}
