public class Fan {
    final int Slow = 1;
    final int Medium = 2;
    final int Fast = 3;
    private int speed = 1;
    private boolean on = false;

    private String color = "blue";
    private double radius = 5.0;
    public Fan(){

    }
    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
