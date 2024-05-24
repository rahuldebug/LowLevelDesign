package lowleveldesign.behavioral.strategy.vehicle;

import lowleveldesign.behavioral.strategy.drivestrategy.DriveStrategy;

public class SportsUtilityVehicle implements BaseVehicle{
    public DriveStrategy driveStrategy;

    public SportsUtilityVehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    @Override
    public void display() {
        System.out.println("driving suv");
    }
}
