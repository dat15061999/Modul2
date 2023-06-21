package ShapeAll;

public class Text {
    public static void main(String[] args) {
        Shape[] sapes = new Shape[2];
        sapes[0]= new Circle("Blue","false",10);
        sapes[1] = new Rectangle("Black","true",10,20);
        for (Shape sape: sapes) {
            System.out.println(sape.toString());
        }

        System.out.println("Math 2");
        Circle circle1 = new Circle("Red","False",10);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
    }
}
