import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        System.out.println("Tinh lai ngan hang");
        System.out.println("Cong thuc la : So tien lai = So tien gui * ti le lai xuat (%nam)/12 * so thang gui");
        System.out.println("Nhap so tien gui : ");
        float money = new Scanner(System.in).nextFloat();
        System.out.println("Nhap so thang gui :");
        int month = new Scanner(System.in).nextInt();
        float interestRate = 5.5f;
        System.out.println("Lai hang nam la 5.5%");
        float totalinterestRate = 0;
        for (int i = 0 ; i < month ; i++) {
            totalinterestRate += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tien lai nhan duoc sau "+month +totalinterestRate);



    }
}
