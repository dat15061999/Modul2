package Example;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,4,5,6,7};
        int a = findFirst(arr,findFirst(arr,binarySearch(arr,0,arr.length-1,4)));
        int b = findLast(arr,findFirst(arr,binarySearch(arr,0,arr.length-1,4)));
        int [] result = {a,b};
        System.out.println(Arrays.toString(result));
        System.out.println("So lan xuat hien cua number la "+findEnd(arr,4));
    }
    public static int binarySearch(int [] arr , int left,int right, int key) {
        int mid = (right+left) / 2;
        while (right>= left) {
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid]>key) {
                return binarySearch(arr,left,mid-1,key);
            }
            if (arr[mid]<key) {
                return binarySearch(arr,mid+1,right,key);
            }
        }
        return -1;
    }
    public static int findFirst(int[]arr, int number) {
        if(number == -1) {
            return -1;
        }
        int i = 0;
        while (arr[i] != arr[number]) {
            i++;
        }
        return i;
    }
    public static int findLast(int [] arr , int number) {
        if(number == -1) {
            return -1;
        }
        int i =arr.length-1;
        while (arr[i] != arr[number]) {
            i--;
        }
        return i;
    }
    public static int findEnd(int []arr, int number) {
        if(number == -1) return -1;
        int i = 0;
        for (Integer item: arr) {
            if (item == number) {
                i++;
            }
        }
        return i;
    }
}
