package BinarySearch2;

import java.util.Arrays;

public class BuubleSort {
    public static void main(String[] args) {
        int [] arr = {8,2,4,5,72,0,9};
        buubleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void buubleSort(int [] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j]>arr[j+1]) {
                    swap(arr,j);
                }
            }
        }
    }
    public static int[] swap(int []arr,int i ) {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
        return arr;
    }
}
