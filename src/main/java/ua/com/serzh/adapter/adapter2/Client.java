package ua.com.serzh.adapter.adapter2;

/**
 * Created by oleksandr.baglai on 19.08.2015.
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
//        Adaptee adaptee = new Adapter();

        doIt(target);
//        doIt((Target) adaptee);
    }

    public static void doIt(Target target) {
        System.out.println(target.request("Hello World!"));
    }
}
