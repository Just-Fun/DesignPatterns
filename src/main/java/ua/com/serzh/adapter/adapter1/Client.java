package ua.com.serzh.adapter.adapter1;

/**
 * Created by oleksandr.baglai on 19.08.2015.
 */
public class Client {
    public static void main(String[] args) {

        Target target = new Adapter(new Adaptee());

        doIt(target);
//        doIt(new Adapter(new Adaptee()));
    }

    public static void doIt(Target target) {
        System.out.println(target.request("Hello World!"));
    }
}
