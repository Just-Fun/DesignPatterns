package ua.com.serzh.singleton.synchronizedAccessor;

/**
 * Created by Serzh on 9/26/16.
 */
//без ленивой инициализации, с использование статического инициализатора
public class Singleton2 {
    private static Singleton2 instance;

    static {
        instance = new Singleton2();
        // В этом блоке возможна обработка исключений
    }

    private Singleton2 () {}

    public static Singleton2 getInstance() {
        return instance;
    }
}
