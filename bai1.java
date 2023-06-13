import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tron");
        double numberR = new Scanner(System.in).nextFloat();
        double chuvi = 2 * Math.PI * numberR;
        double dientich = numberR * numberR * Math.PI;
        System.out.println("Chu vi la " + chuvi);
        System.out.println("Dien tich la " + dientich);
        System.out.println("Dien tich la " + dientich);

    }
}
