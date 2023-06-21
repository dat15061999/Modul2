package ShapeAll;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(String color, Boolean filled) {
        super(color, Boolean.valueOf(filled));
    }



    public void Rectangle() {
        width = 1.0;
        length = 1.0;
    };

    public Rectangle(String color, String filled, double width, double length) {
        super(color, Boolean.valueOf(filled));
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
      return   width*length;
    };
    public double getPerimeter() {
        return (width+length)/2 ;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="+width+" and length="+length+", which is a subclass of "+super.toString();
    }
}
