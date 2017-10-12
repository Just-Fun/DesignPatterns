package ua.com.serzh.strategy.timur.batyrshinov.start;

import ua.com.serzh.strategy.timur.batyrshinov.auth.UserChecker;
import ua.com.serzh.strategy.timur.batyrshinov.strategy.DBAuth;
import ua.com.serzh.strategy.timur.batyrshinov.strategy.FileAuth;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker("name", "password");

        userChecker.check(new DBAuth("jdbc://etc"));

        userChecker.check(new FileAuth(new File("c:\\file.txt")));

        List<Integer> integers = new ArrayList<>();
//        Collections.sort(integers, Comparator.comparingInt(o -> o));
        integers.sort(Comparator.comparingInt(o -> o));

    }
}
