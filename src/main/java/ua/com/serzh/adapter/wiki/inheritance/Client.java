package ua.com.serzh.adapter.wiki.inheritance;

/**
 * Created by Serzh on 9/18/16.
 */
public class Client {
    public static void main (String [] args){
        Chief chief = new ChiefAdapter();

        Object key = chief.makeDinner();
    }
}
