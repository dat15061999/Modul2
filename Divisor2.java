import java.util.Scanner;

public class Divisor2 {
    public static void main(String[] args) {
        int a ;
        int b ;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a :");
        a = input.nextInt();
        System.out.println("Nhap b :");
        b= input.nextInt();
        if ( a == 0 || b == 0 ) {
            System.out.println("No");
        }
        while (a != b) {
            if ( a > b) {
                a = a - b;
            } else {
                b =  b - a;
            }
        }
        System.out.println("Common factor " + a);
    }
}
