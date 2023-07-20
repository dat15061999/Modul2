package TryCatch;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample newArray = new ArrayExample();
        Integer[] numbers = newArray.creatRandom();
        System.out.println("Nhap so bat ky: ");
        int num = new Scanner(System.in).nextInt();
        try {
            System.out.println("Gia tr cua mang la " + num + " gia tri la " + numbers[num]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Vhi so vuowt qua");
        }
    }
    public Integer[] creatRandom() {
        Random rd = new Random();
        Integer[] nums = new Integer[100];
        System.out.println("Danh sach pt cua mang: ");
        for (int i = 0; i < 100; i++) {
            nums[i]=rd.nextInt(100);
            System.out.println(nums[i]);
        }
        return nums;
    }
}
