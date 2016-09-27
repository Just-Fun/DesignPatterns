package ua.com.serzh.singleton.synchronizedAccessor;

/**
 * Created by Serzh on 9/27/16.
 */
//+ Ленивая инициализация
//+ Высокая производительность
public class SingletonLazy2 {
    private static volatile SingletonLazy2 instance;

    public static SingletonLazy2 getInstance() {
        SingletonLazy2 localInstance = instance;
        if (localInstance == null) {
            synchronized (SingletonLazy2.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new SingletonLazy2();
                }
            }
        }
        return localInstance;
    }
}
