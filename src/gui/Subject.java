package gui;

import java.util.ArrayList;

public abstract class Subject {
    public static ArrayList<Observer> observers = new ArrayList<Observer>();

    public void register (Observer observer) {
        observers.add(observer);
    }
    
    public void unregister(Observer observer) {
        observers.remove (observer);
    }

    public void notifyObservers(){}
    
    public void updateChartList(){
        if(MainWindow.getRequestedChartTypes()!= null){
            for (String i : MainWindow.getRequestedChartTypes()){
                Observer.analysis.add(i);
            }
        }
    }
}
