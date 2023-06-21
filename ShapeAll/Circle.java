package ShapeAll;

public class Circle extends Shape{
    protected double radius;

    public Circle(String color, String filled, double radius) {
        super(color, Boolean.valueOf(filled));
        this.radius = radius;
    }

    public void Circle() {
        radius = 1.0;
    };

    public Circle(String color, Boolean filled) {
        super(color, Boolean.valueOf(filled));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return (2 * (getRadius()*Math.PI));
    }
    public double getPerimeter() {
        return (getRadius()*getRadius()*Math.PI);
    }

    @Override
    public String toString() {
        return "A Circle with radius=" +radius+", which is a subclass of "+super.toString();
    }
}
