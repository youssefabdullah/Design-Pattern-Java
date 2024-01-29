package org.example.Observer;

public interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyAllObservers();
}
