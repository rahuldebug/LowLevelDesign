package lowleveldesign.observable;

import lowleveldesign.observer.Observer;

public interface Observable {
    public void add(Observer observer);

    public void remove(Observer observer);

    public void notifyObserver();

    public void addInventory();
}
