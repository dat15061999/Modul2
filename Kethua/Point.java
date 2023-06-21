package Kethua;

public class Point {
    protected float x;
    protected float y;
    public Point () {};
    public Point ( float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY( float x , float y) {
        this.x = x;
        this.y = y;
    }
    public Float [] getXY() {
        Float[] arr = new Float[2];
        arr[0]=x;
        arr[1]=y;
        return arr;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y ;
    }
}
