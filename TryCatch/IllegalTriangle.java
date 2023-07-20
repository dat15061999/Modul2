package TryCatch;

import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {
        try{
            double a = getValue("Nhap canh a : ");
            double b = getValue("Nhap canh b : ");
            double c = getValue("Nhap canh c : ");
            if (a<=0 ||b<=0|| c<=0 || a+b <c ||a+c <c|| c+b <a ) {
                throw new IllegalArgumentException("Gia tri canh khong hop le");
            }
            double p = (a+b+c)/2;
            double are = Math.sqrt((p*(p-a)*(p-b)*(p-c)));
            System.out.println("Dien tich la : " + are);
        } catch (Exception e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }
    public static double getValue(String str) {
        Scanner input = new Scanner(System.in);
        System.out.println(str);
        double value = input.nextDouble();
        return value;
    }
}
