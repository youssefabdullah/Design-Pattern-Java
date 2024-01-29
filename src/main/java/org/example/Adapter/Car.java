package org.example.Adapter;

public class Car implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("car start move");
    }

    @Override
    public void pushBreak() {
        System.out.println("car stop");
    }

    @Override
    public void soundHorn() {
        System.out.println("Beeb Beeb");
    }
}
