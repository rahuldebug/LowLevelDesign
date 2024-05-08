package solid.singleresponsibility;
/*
* Single responsibility principle tells , a class should change for only one reason and one reason alone
* this help in writing maintainable code .
* */
public class Marker {
    String Name;
    String Color;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    float Price;

    public Marker(String name, String color, float price) {
        Name = name;
        Color = color;
        Price = price;
    }




}
