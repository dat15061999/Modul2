import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {
    public static void main(String[] args) {
        int[] numbers = {2,3,4,5,5,6,5,77,8,4,25,0,0,0,0,0};
        System.out.println("Nhap vi tri muon them :");
        int length1 = new Scanner(System.in).nextInt();
        System.out.println("Nhap so muon doi :");
        int number = new Scanner(System.in).nextInt();
        for (int i = numbers.length -1; i > length1 ; i--) {
            numbers[i] =  numbers[i-1];
        }
        numbers[length1] = number;
        System.out.println(Arrays.toString(numbers));
    }
}
