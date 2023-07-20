package Example;

import java.util.Arrays;

public class Text6 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,4,5,3,6,7};
        int a = findFirst(arr,findFirst(arr,binarySearch(arr,0,arr.length-1,3))) ;
        int b = findLast(arr,findFirst(arr,binarySearch(arr,0,arr.length-1,3))) ;
        int [] result ={a,b};
        System.out.println(Arrays.toString(result));
        System.out.println(findEnd(arr,3));
    }

    public static int binarySearch(int [] arr, int left , int right ,int number) {
        int mid = (right + left)/2;
        while (left<=right) {
            if (arr[mid] == number) {
                return mid;
            }
            else if (arr[mid]> number) {
                return binarySearch(arr,left,mid - 1,number);
            } else if (arr[mid] < number); {
                return  binarySearch(arr,  mid +1,right ,number);
            }
        }
        return -1;
    }
    public static int findFirst(int [] arr,int number) {
        if (number == -1) {
            return -1;
        }
        int i =0;
        while (arr[i] != arr[number]) {
            i++;
        }
        return i;
    }
    public static int findLast(int [] arr,int number) {
        if (number == -1) {
            return -1;
        }
        int i =arr.length-1;
        while (arr[i] != arr[number]) {
            i--;
        }
        return i;
    }
    public static int findEnd(int [] arr , int key) {
        if (key == -1 ) {
            return -1;
        }
        int i =0;
        for (Integer num : arr) {
            if (num == key) {
                i++;
            }
        }
        return i;
    }
}
