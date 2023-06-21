package Kethua;

public class Point3D extends Point2D {
    private float z;

    public static void main(String[] args) {
        Point3D arr = new Point3D(4,5,6);
        arr.setXYZ(3,4,6);
        for (Float item:arr.getXYZ()) {
            System.out.println(item);
        }
        System.out.println(arr.toString());
        arr.setXYZ(8,4,6);
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Float [] getXYZ () {
        Float [] floats = new Float[3];
        floats[0]=x;
        floats[1]=y;
        floats[2]=z;
        return floats;
    }


    @Override
    public String toString() {
        return
                "z=" + z +
                ", x=" + x +
                ", y=" + y
                ;
    }
}
