package lowleveldesign.observerpattern.observable;

import lowleveldesign.observerpattern.observer.Observer;

public interface Observable {
    public void add(Observer observer);

    public void remove(Observer observer);

    public void notifyObserver();

    public void addInventory();
}
