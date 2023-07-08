package lowleveldesign.factorypattern.shapefactory;

import lowleveldesign.factorypattern.shape.Circle;
import lowleveldesign.factorypattern.shape.DefaultShape;
import lowleveldesign.factorypattern.shape.Shape;
import lowleveldesign.factorypattern.shape.Square;

public class ShapeFactory {
    public Shape getShape(String shape){

        return switch (shape.toUpperCase()) {
            case ("CIRCLE") -> new Circle();
            case ("SQUARE") -> new Square();
            default -> new DefaultShape();
        };

    }
}
