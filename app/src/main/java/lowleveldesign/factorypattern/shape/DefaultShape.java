package lowleveldesign.factorypattern.shape;

public class DefaultShape implements Shape{
    @Override
    public void draw() {
        System.out.println("default shape");
    }
}
