package BinarySearch2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 32, 33, 4, 7, 9, 3, 2, 6};
        for (int i = 0; i < arr.length; i++) {
            swap(arr,findMin(i,arr),i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int findMin(int in, int[] nums) {
        int min = in;
        for (int i = in; i < nums.length; i++) {
            if (nums[min] > nums[i]) {
                min = i;
            }
        }
        return min;
    }

    public static int[] swap(int[] arr, int indexmin, int i) {
        int temp = arr[i];
        arr[i] = arr[indexmin];
        arr[indexmin] = temp;
        return arr;
    }
}
