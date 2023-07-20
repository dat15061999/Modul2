package Example;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] nums1 = {6, 5, 6, 4};
        System.out.println(isMonotonic(nums1));
//        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    public static int singleNumber(int[] nums) {
        int number = 0;
//        for (int i = 0; i < nums.length; i++) {
//            number = nums[i];
//            if (number == nums[i + 1]) {
//                number = nums[i];
//            }
//        }
        return number;
    }

    public static boolean isMonotonic(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    return false;
                }
            }
        }

            return true;
    }
    public static int[] sortArrayByParityII(int[] nums) {
        boolean check;
        do {
            check = false;
            for (int i =0 ; i< nums.length-1 ; i++) {
                if( nums[i] %2 !=0 & nums[i+1]%2 ==0) {
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    check =true;
                }
            }
        } while(check);
        return nums;

    }
    public static int[] sortArray(int[] nums) {
        int even =1;
        int odd =0 ;
        int [] result = new int [nums.length];
        for(int a : nums) {
            if(a % 2 ==0) {
                result[odd] = a;
                odd+=2;
            } else {
                result[even] = a;
                even+=2;
            }
        }
        return result;


    }
}
