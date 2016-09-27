package ua.com.serzh.singleton;

/**
 * Created by serzh on 2/5/16.
 */
public class TestHarness {
    public static void main(String[] args) {
        NormalObject object1 = new NormalObject();
        NormalObject object3 = new NormalObject();
        System.out.println(object1);
        System.out.println(object3);

        SingletonSynchBest object = SingletonSynchBest.getInstance();
        SingletonSynchBest object2 = SingletonSynchBest.getInstance();
        System.out.println(object);
        System.out.println(object2);

    }

}
