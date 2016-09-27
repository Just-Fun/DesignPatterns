package ua.com.serzh.singleton.synchronizedAccessor;

/**
 * Created by Serzh on 9/26/16.
 */
// Этот вариант блокирует метод getInstance() вне зависимости от того, создали ли мы единственный экземпляр или нет.
// Это замедляет работу программы, если требуется часто получать объект SingletonLazy из разных потоков.
//    thread-safe sample implementation
//    Ленивый SingletonLazy
// + Ленивая инициализация
// - Низкая производительность (критическая секция) в наиболее типичном доступе
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy() {}

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
