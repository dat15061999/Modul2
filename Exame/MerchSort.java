package Exame;

import java.util.Arrays;
import java.util.Objects;

public class MerchSort extends Sort {
    public MerchSort() {}

    @Override
    public int[] sort(int[] arr) {
        return mergeSortAscending(arr, 0, arr.length - 1);
    }
    private static int[] mergeSortAscending(int[] nums, int left, int right) {
        if (left > right) {
            return new int[0];
        }
        if (left == right) {
            return new int[]{nums[left]};
        }
        int mid = (right + left) / 2;
        int[] a1 = mergeSortAscending(nums, left, mid);
        int[] a2 = mergeSortAscending(nums, mid + 1, right);
        return mergeAc(a1, a2);
    }

    private static int[] mergeAc(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] result = new int[n];
        int i = 0;
        int k1 = 0;
        int k2 = 0;
        while (i < n) {
            if (k1 < a1.length && k2 < a2.length) {
                if (compare(a1[k1],a2[k2]) ) {
                    result[i] = a1[k1];
                    k1++;
                } else {
                    result[i] = a2[k2];
                    k2++;
                }
                i++;
            } else {
                if (k1 < a1.length) {
                    result[i] = a1[k1];
                    k1++;
                } else {
                    result[i] = a2[k2];
                    k2++;
                }
                i++;
            }
        }
        return result;
    }
    @Override
    protected void printSort(int[] arr) {
        for (int j : arr) {
            System.out.printf(j + " ");
        }
        System.out.println();
    }
}
