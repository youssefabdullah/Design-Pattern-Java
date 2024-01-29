package org.example.Singleton;

public class SingletonMain {
    public static void main(String[] args) {

        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println(lazySingleton.hashCode());
        lazySingleton.printData();

        System.out.println(lazySingleton2.hashCode());
        lazySingleton2.printData();



        Thread thread = new Thread(()->{
            try {
                ThreadSafe.getInstance().printData();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread.start();
    }
}
