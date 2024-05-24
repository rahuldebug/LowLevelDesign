package lowleveldesign.behavioral.strategy.vehicle;

import lowleveldesign.behavioral.strategy.drivestrategy.DriveStrategy;

public class NormalVehicle implements BaseVehicle{
    DriveStrategy driveStrategy;
    @Override
    public void display() {
        System.out.println("driving normal vehicle");
        //System.out.println(driveStrategy.drive());
    }
}
