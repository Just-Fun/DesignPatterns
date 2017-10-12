package ua.com.serzh.strategy.timur.batyrshinov.auth;

import ua.com.serzh.strategy.timur.batyrshinov.strategy.AuthStrategy;

public class UserChecker {

    private String name;
    private String password;

    public UserChecker(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public boolean check(AuthStrategy authStrategy) {
        return authStrategy.checkLogin(name, password);
    }
    
}
