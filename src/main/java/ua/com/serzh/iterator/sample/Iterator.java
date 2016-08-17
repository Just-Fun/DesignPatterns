package ua.com.serzh.iterator.sample;

/**
 * Created by oleksandr.baglai on 16.09.2015.
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();

    void remove();
}
