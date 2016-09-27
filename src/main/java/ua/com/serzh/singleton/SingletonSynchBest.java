package ua.com.serzh.singleton;

/**
 * Created by serzh on 2/5/16.
 */
public class SingletonSynchBest {
    private static volatile SingletonSynchBest object;
    private static String lockObj = "Lock"; // Use for locking

    private SingletonSynchBest() {
    }

    public static SingletonSynchBest getInstance() {
        if (object != null) {
            return object;
        } else {
            // Start a synchronized block, only one thread can enter and stay in the block one at a time
            synchronized (lockObj) {
                if (object == null) {
                    object = new SingletonSynchBest();
                }
            } // End of synchronized block
            return object;
        }
    }
}
