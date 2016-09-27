package ua.com.serzh.singleton.synchronizedAccessor;

/**
 * Created by Serzh on 9/27/16.
 */
//+ Ленивая инициализация
//+ Высокая производительность
//- Невозможно использовать для не статических полей класса
public class SingletonLazy3 {

    public static class SingletonHolder {
        public static final SingletonLazy3 HOLDER_INSTANCE = new SingletonLazy3();
    }

    public static SingletonLazy3 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
