package lowleveldesign.observerpattern.observable;

import lowleveldesign.observerpattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Notify implements Observable {
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.removeIf(observer1 -> observer1.equals(observer));

    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }

    }

    public void addInventory() {
        //simulating addition of inventory
        notifyObserver();
    }
}
