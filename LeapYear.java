import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Nam can xet");
        int year = new Scanner(System.in).nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "La nam nhuan");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + "la nam nhuan");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + "ko phai la nam nhuan");
        } else {
            System.out.println(year + "ko phai la nam nhuan");
        };
    }
}
