package ua.com.serzh.adapter.adapter5;

/**
 * Created by oleksandr.baglai on 19.08.2015.
 */
public class Client {
    public static void main(String[] args) {
        final Adaptee adaptee = new Adaptee();

       /* Target target = new Target() {
            @Override
            public Object request(Object input) {
                return adaptee.specificRequest(input);
            }
        };*/
        Target target = input -> adaptee.specificRequest(input);
        doIt(target);
    }

    public static void doIt(Target target) {
        System.out.println(target.request("Hello World!"));
    }
}
