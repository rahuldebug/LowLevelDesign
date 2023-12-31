/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lowleveldesign.app;

import lowleveldesign.decoratorpattern.base.ClassicPizza;
import lowleveldesign.decoratorpattern.decorators.ExtraCheese;
import lowleveldesign.factorypattern.shapefactory.ShapeFactory;
import lowleveldesign.observerpattern.observable.Notify;
import lowleveldesign.observerpattern.observable.Observable;
import lowleveldesign.observerpattern.observer.Observer;
import lowleveldesign.observerpattern.observer.Client;
import lowleveldesign.strategy.drivestrategy.SportsDriveStrategy;
import lowleveldesign.strategy.vehicle.SportsUtilityVehicle;

public class App {
    public static void main(String[] args) {
//this is for observer design pattern
        Observable observable = new Notify();
        Observer observer = new Client(observable, "abc@gmail.com");
        observable.add(observer);
        observable.addInventory();
//for decorator
        System.out.println(new ExtraCheese(new ClassicPizza()).cost());
//Strategy Design Pattern
        SportsDriveStrategy sportsDriveStrategy= new SportsDriveStrategy();
        SportsUtilityVehicle sportsUtilityVehicle= new SportsUtilityVehicle(sportsDriveStrategy);
        sportsUtilityVehicle.display();
        sportsUtilityVehicle.driveStrategy.drive();
//for factory
        ShapeFactory shapeFactory= new ShapeFactory();
        shapeFactory.getShape("circle").draw();


    }
}
