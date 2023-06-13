import java.util.Scanner;

public class Prime100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to");
        int number = input.nextInt();
        int N =2;
        int count =0;
        while (count<number) {
            if (isPrime(N)){
                System.out.println(N + "is a Prime");
            }
            count++;
            N++;
        }
    }
    public static boolean isPrime(int num ){
        if (num < 2 ) {
            return false;
        }
            int i =2 ;
            while (i < num) {
                if (num % i ==0) {
                    return false;
                }
                i++;
            }
            return true;


    }
}
