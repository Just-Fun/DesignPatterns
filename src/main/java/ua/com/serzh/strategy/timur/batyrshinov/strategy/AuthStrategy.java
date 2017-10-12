package ua.com.serzh.strategy.timur.batyrshinov.strategy;

public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}
