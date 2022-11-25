package gui;

import java.util.ArrayList;

public abstract class Subject {
    public ArrayList<Observer> observers = new ArrayList<Observer>();

    public void register (Observer observer) {
        observers.add(observer);
    }
    
    public void unregister(Observer observer) {
        observers.remove (observer);
    }

    public void notifyObservers(){}
}
