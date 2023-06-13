import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        System.out.println("Nhap can nang");
        float weight = new Scanner(System.in).nextFloat();
        System.out.println("Nhap chieu cao");
        float height = new Scanner(System.in).nextFloat();
        float Bmi = weight / (height*height);
        System.out.printf("%-20s%s","Bmi","Chi so\n");
        if (Bmi<18.5) {
            System.out.printf("%-20.2f%s",Bmi," Underweight");
        } else if (18.5 <= Bmi && Bmi < 25.0) {
            System.out.printf("%-20.2f%s",Bmi," Normal");
        } else if (25.0<= Bmi && Bmi <30.0) {
            System.out.printf("%-20.2f%s",Bmi," Overweight");
        } else if (30<= Bmi) {
            System.out.printf("%-20.2f%s",Bmi," Obese");
        }
    }
}
