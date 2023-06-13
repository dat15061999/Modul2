import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Nhap so");
        int a = new Scanner(System.in).nextInt();
        switch (a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30nagy");
                break;
            case 2 :
                System.out.println("29 ngay");
                break;
            default:
                System.out.println("Number is valid");
        }
    }
}
