package org.example.Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreadSafe {

    private String[] LETTERS = {"a", "b", "c", "d", "e"};
    private List<String> data = Arrays.asList(LETTERS);
    private static ThreadSafe instance;
    private static boolean delayMe=true;
    public static ThreadSafe getInstance() throws InterruptedException {
        if (instance == null) {
            if(delayMe){
                Thread.currentThread();
                Thread.sleep(1000);
            }

            instance = new ThreadSafe();
        }
        return instance;
    }

    private ThreadSafe() {
        Collections.shuffle(data);

    }

    public void printData() {
        for (String s : data) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
