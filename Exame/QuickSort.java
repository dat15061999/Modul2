//package Exame;
//
//import java.util.Arrays;
//
//public class QuickSort extends Sort {
//    public QuickSort() {}
//
//    public static void main(String[] args) {
//        int[] nums = {1,7,5,8,9,3,4,2,6};
//        System.out.println(Arrays.toString(nums));
//        quickSort(nums,0,nums.length-1);
//        System.out.println(Arrays.toString(nums));
//    }
//    @Override
//    int[] ascending(int[] str) {
//        quickSort(str,0,str.length-1);
//        return str;
//    }
//    private static void quickSort(int [] arr, int left , int right) {
//       if (left>=right) return;
//       int key = arr[(left+right)/2];
//       int k = partition(arr,left,right,key);
//       quickSort(arr,left,k-1);
//       quickSort(arr,k,right);
//    }
//    private static int partition(int [] arr, int left, int right, int key) {
//        int k1 = left;
//        int k2 = right;
//        while (k1<=k2) {
//            while (arr[k1]<key) k1++;
//            while (arr[k2]>key) k2--;
//            if (k1<= k2) {
//                int temp = arr[k1];
//                arr[k1]=arr[k2];
//                arr[k2]=temp;
//                k1++;k2--;
//            }
//        }
//        return k1;
//    }
//
//    @Override
//    int[] decrease(int[] str) {
//        return super.decrease(str);
//    }
//
//    @Override
//    void printSort(int[] arr) {
//        for (int j : arr) {
//            System.out.printf(j + " ");
//        }
//        System.out.println();
//    }
//
//    @Override
//    void swap(int[] arr, int i, int j) {
//        int temp = arr[j];
//        arr[j] = arr[i];
//        arr[i] = temp;
//    }
//}
