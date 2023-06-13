import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        System.out.println("Ty gia hien tai 23,000 VND/USD");
        System.out.println("Nhap so USD ban muon doi qua VND");
        float usd = new Scanner(System.in).nextFloat();
        float vnd = usd*23000f;
        System.out.println("SO USD ban can doi la "+usd);
        System.out.println("So VND sau doi la "+ vnd);
    }
}
