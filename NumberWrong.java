import java.util.Scanner;

public class NumberWrong {
    public static void main(String[] args) {
            Boolean check = false;
        do {
            System.out.println("Nhap 1 so");
            int a = new Scanner(System.in).nextInt();
            if (a %2 ==0) {
                check = true;
            }
        } while (!check);
    }
}
