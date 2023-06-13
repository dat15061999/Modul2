import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class Obj3 {
    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        time.start();
        System.out.println(time.getStartTime());
        int index = 5;
        int[] numbers1 = new int[index];
        int[] numbers2 = new int[index];
        getNumber(numbers1);
        getNumber(numbers2);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers1.length; i++) {
            numbers[i] = numbers1[i];
        }
        for (int i = 0; i < numbers2.length; i++) numbers[index + i] = numbers2[i];
        System.out.println(Arrays.toString(numbers));
        time.stop();
        System.out.println(time.getEndTime());
        System.out.println(time.toString());
    }

    public static int[] getNumber(int[] arr) {
        int i = 0;
        int index = 5;
        do {
            System.out.println("Nhap mang o vi tri thu " + (i + 1));
            arr[i] = new Scanner(System.in).nextInt();
            i++;
        } while (i < index);
        return arr;
    }

}

