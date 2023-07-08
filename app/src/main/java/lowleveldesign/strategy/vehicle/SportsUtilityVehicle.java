package lowleveldesign.strategy.vehicle;

import lowleveldesign.strategy.drivestrategy.DriveStrategy;

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
