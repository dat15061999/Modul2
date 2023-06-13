import java.util.Scanner;

public class Prime20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên tố cần in ra");
        int number = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count < number){
            if (check(N)){
                System.out.println("so nguyen to " + N);
                count++;
        }
            N++;
    }

    }
    public static boolean check(int n){
        if (n < 2){
            return false;
        }
        else {
            int i = 2;
            while (i<n){
                if (n % i ==0){
                    return false;
                }
                i++;
            }
            return true;
        }
    }


}


