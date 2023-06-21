package ShapeAll;

public class Shape {
    protected String color;
    protected Boolean filled;

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        String newfill = "filled";
        if (!filled) newfill = "Notfilled";
        return " A Shape with color of " + color + " "+ newfill;
    }
}
