package org.example.Singleton;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LazySingleton {
    private String[] LETTERS = {"a", "b", "c", "d", "e"};
    private List<String> data = Arrays.asList(LETTERS);
    //Egare
   // private static LazySingleton instance =new LazySingleton();
    private static LazySingleton instance;
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    private LazySingleton() {
        Collections.shuffle(data);

    }

    public void printData() {
        for (String s : data) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
