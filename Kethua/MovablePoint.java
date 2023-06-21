package Kethua;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public static void main(String[] args) {
        MovablePoint arr = new MovablePoint(5,6,8,9);
        arr.move();
        System.out.println(arr.toString());
    }
    public MovablePoint ( float xSpeed,float ySpeed,float x, float y) {
        super(x,y);
        this.xSpeed =xSpeed;
        this.ySpeed =ySpeed;
    }
    public MovablePoint (float xSpeed, float ySpeed) {
        this.xSpeed =xSpeed;
        this.ySpeed =ySpeed;
    }
    public MovablePoint() {};

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed) {
        this.xSpeed =xSpeed;
        this.ySpeed =ySpeed;
    }
    public Float[] getSpeed(){
        Float[] arr = new Float[2];
        arr[0]=xSpeed;
        arr[1]=ySpeed;
        return arr;
    }

    @Override
    public String toString() {
        return
                "Speed= (" + xSpeed +
                "," + ySpeed +
                "), (" + x +
                ", " + y +")";
    }

    public MovablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
