import java.util.Scanner;

public class Equation1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation");
        System.out.println("Equation: a * x + b = c");
        System.out.println("Nhap a");
        float a = new Scanner(System.in).nextFloat();
        System.out.println("Nhap b");
        float b = new Scanner(System.in).nextFloat();
        System.out.println("Nhap c");
        float c = new Scanner(System.in).nextFloat();
        float x;
        if (b != c) {
            x = (c - b) / a;
            System.out.println("Value x " + x);
        } else {
            System.out.println("Value x = 0");
        }


    }
}
