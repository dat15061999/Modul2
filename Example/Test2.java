package Example;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Dem so lan xuat hien");
        int[] arr = {1,2,3,3,4,4,5,5,3,7};
//        System.out.println(binarySearch(arr,0,arr.length,4));
        int a = findFirst(arr,findFirst(arr,binarySearch(arr,0,arr.length,3)));
        int b = findLast(arr,findFirst(arr,binarySearch(arr,0,arr.length,3)));
        int[] result = {a,b};
        System.out.println(Arrays.toString(result));

    }

    public static int binarySearch(int[] arr, int left, int right, int number){
        int mid = left + (right - left)/2;
        if (right>=left){
            if(arr[mid] == number){
                return mid;
            }
            if (arr[mid]>number){
                return binarySearch(arr,left,mid-1,number);
            }
            if (arr[mid]<number){
                return binarySearch(arr,mid +1,right,number);
            }

        }
        return -1;

    }
    public static int findFirst(int[] arr,int number){
        if (number == -1){
            System.out.println("So can tim khong co trong day");
        }
        int i = 0;
        while( arr[i] !=arr[number]){
            i++;
        }
        return i;
    }
    public static int findLast(int[] arr,int number){
        if (number == -1){
            System.out.println("So can tim khong co trong day");
        }
        int i = arr.length-1;
        while( arr[i] !=arr[number]){
            i--;
        }
        return i;
    }
}
