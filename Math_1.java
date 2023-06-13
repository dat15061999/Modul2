import java.util.Scanner;

public class Math_1 {
    public static void main(String[] args) {
        Scanner round = new Scanner(System.in);
        float width;
        float height;
        System.out.println("Nhap dai");
        width = round.nextFloat();
        System.out.println("Nhap cao");
        height = round.nextFloat();
        float math_spaure = width*height;
        System.out.println("Dien tich hinh chu nhat "+math_spaure);
    }
}
