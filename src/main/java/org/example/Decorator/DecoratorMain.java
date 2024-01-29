package org.example.Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Sandwich sandwich = new BasicSandwich();
        System.out.println(sandwich.getDescription());
        System.out.println(sandwich.getCost());

        Sandwich sandwich1 = new Fool(new Salt(new BasicSandwich()));
        System.out.println(sandwich1.getDescription());
        System.out.println(sandwich1.getCost());
    }
}
