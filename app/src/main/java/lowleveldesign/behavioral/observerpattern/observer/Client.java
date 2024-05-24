package lowleveldesign.behavioral.observerpattern.observer;

import lowleveldesign.behavioral.observerpattern.observable.Observable;

import java.util.Objects;

public class Client implements Observer {
    Observable observable;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client person = (Client) o;
        return Objects.equals(observable, person.observable) && Objects.equals(emailId, person.emailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(observable, emailId);
    }

    public Client(Observable observable, String emailId) {
        this.observable = observable;
        this.emailId = emailId;
    }

    String emailId;

    @Override
    public void update() {
        System.out.println("sending mail to email : " + emailId);
    }
}
