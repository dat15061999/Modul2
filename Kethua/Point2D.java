package Kethua;

public class Point2D {
    protected float x;
    protected float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {

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
    public void setXY (float x , float y) {
        this.x = x;
        this.y = y;
    }
    public Float [] getXY() {
        Float [] floats = new Float[2];
        floats[0]=x;
        floats[1]=y;
        return floats;
    }

    public static void main(String[] args) {
        Point2D arr = new Point2D(4,6);
        arr.setXY(8,9);
        arr.getXY();
        for (Float item: arr.getXY())
              {
        System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return  "x=" + x + ", y=" + y ;
    }
}
