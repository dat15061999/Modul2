package Exame;

public class InsertionSort extends Sort<InsertionSort>{
    public InsertionSort() {}

    @Override
    int[] ascending(int[] str) {
        int[] max = new int [] {str.length};
        for(int i = 0 ; i < str.length-1; i++) {
            max[i] = str[0];
            for (int j = i+1 ; j < str.length-1-i; j++) {
                if (max[i]>str[j]) {
                    int temp = max[i];
                    max[i] = str[j];
                    max[j] = temp;
                }
            }
        }
        return max;
    }

    @Override
    int[] decrease(int[] str) {
        return super.decrease(str);
    }
    @Override
    void printSort(int[] arr) {
        for (int i = 0; i < arr.length-1;i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

}
