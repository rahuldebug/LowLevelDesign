package lowleveldesign.behavioral.observerpattern.observable;

import lowleveldesign.behavioral.observerpattern.observer.Observer;

public interface Observable {
    public void add(Observer observer);

    public void remove(Observer observer);

    public void notifyObserver();

    public void addInventory();
}
