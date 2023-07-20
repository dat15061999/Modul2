package BinarySearch2;

import java.util.Arrays;
import java.util.Scanner;

public class SetupSearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numberString = input.nextLine();
        String[] numberArray = numberString.split("");
        int[] numbers = new int[numberArray.length];
        for (int i = 0; i < numberArray.length; i++) {
            numbers[i] = Integer.parseInt(numberArray[i]);
        };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(binarySearch(numbers,0,numbers.length,6));

    }
    public static int binarySearch(int[] array,int left, int right, int value) {
        while(left<=right) {
        int mid = (left+right)/2;
            if (array[mid] == value) {
                return mid;
            } else if (value > array[mid]) {
                left = mid +1;
            } else {
                right = mid -1;
            }
        }return -1;
    }
}
