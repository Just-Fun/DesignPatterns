package ua.com.serzh.adapter.adapter2;

/**
 * Created by oleksandr.baglai on 19.08.2015.
 */
public class Adapter extends Adaptee implements Target {

    public Object request(Object input) {
//        return super.specificRequest(input);
        return specificRequest(input);
    }
}
