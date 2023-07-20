package Example;

import java.util.Arrays;

public class Text5 {
    private  void method(int[] x) {
        x[0] = 5;
        x[1] = 5;
    }
    public static void main(String[] args) {
        int [] arr = new int []{-1,0,3,5,9,12};
        int index = Arrays.binarySearch(arr,2);
         System.out.println(index);
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] nums1 = Arrays.copyOfRange(nums,0,n);
        int[] nums2 = Arrays.copyOfRange(nums,n,nums.length);
        int [] number = new int [nums.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while(k < number.length) {
            if(k % 2 ==0 ) {
                number[k] = nums1[i];
                i++;
                k++;
            }
            number[k] = nums2[j];
            j++;
            k++;
        }
        return number;
    }
}
