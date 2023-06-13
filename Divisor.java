import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        System.out.println("Nhap so can kiem tra");
        int number = new Scanner(System.in).nextInt();
        if (number < 2) {
            System.out.println(number + "Khong phai la so nguyen to");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i ==0 ) {
                    check = false;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }
        }
    }
}
