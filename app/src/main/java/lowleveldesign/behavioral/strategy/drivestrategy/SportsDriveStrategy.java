package lowleveldesign.behavioral.strategy.drivestrategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("sports drive strategy initiated ");
    }
}
