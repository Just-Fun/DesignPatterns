package ua.com.serzh.builder;

import java.util.ArrayList;
import java.util.List;

public class TempMain {
    public static void main(String[] args) {
        TempTest test = new TempTest();
        List<String> strings = new ArrayList<>();
        test.setList(strings);
        List<String> list = test.getList();
        System.out.println((list == null));
        System.out.println(test);
    }
}
