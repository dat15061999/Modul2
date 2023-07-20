package MergeSort;

import java.util.Arrays;

public class MergerSort2 {
    public int[] merge(int[] a1,int[] a2 ) {
        int n = a1.length +a2.length;
        int[] result = new int [n];

        int i =0,i1=0,i2=0;
        while (i<n) {
            if(i1 <a1.length && i2 < a2.length) {
                if(a1[i1] <= a2[i2]) {
                    result[i] = a1[i1];
                    i++;i1++;
                } else {
                    result[i] = a2[i2];
                    i++;i2++;
                }
            } else {
                if(i1 < a1.length) {
                    result[i] = a1[i1];
                    i++;i1++;
                } else {
                    result[i] = a2[i2];
                    i++;i2++;
                }
            }
        }

        return result;
    }
    public int[] mergerSort(int[] a,int L , int R) {
        if(L>R) return new int [0];
        if(L==R) {
            int[] singleElement = {a[L]};
            return singleElement;
        }
        System.out.println("Chia: " + L + " - " + R);
        int k = (L+R)/2;
        int[] a1 = mergerSort(a,L,k);
        int[] a2 = mergerSort(a,k+1,R);

        int[] result = merge(a1,a2);
        return result;
    }
    public int[] sortArray(int [] nums) {
            return mergerSort(nums,0, nums.length-1);
    }

    public static void main(String[] args) {
        MergerSort2 s = new MergerSort2();
//        int[] a ={};
//        int[] b = {2,4,6,8,10};
        int[] c = {1,5,3,2,8,7,6,4};
//        System.out.println(Arrays.toString(s.merge(a,b)));
        System.out.println(Arrays.toString(s.mergerSort(c,0,c.length-1)));
    }
}
