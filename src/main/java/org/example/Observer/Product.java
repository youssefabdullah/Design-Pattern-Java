package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private String name;
    private String availablity;
    private List<Observer> observerList;

    public Product(String name) {
        this.name = name;
        observerList = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        observerList.stream()
                .forEach(observer -> {
                    observer.update(availablity,name);
                });
    }

    public void setAvailablity(boolean availablity) {
        this.availablity = availablity ? "Available" : "Not Available";
        notifyAllObservers();
    }
}
