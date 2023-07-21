package Exame;

public class InsertionSort extends Sort{
    @Override
    public int[] sort(int[] arr) {
        for(int i =1 ;i < arr.length ; i++ ) {
            int key = arr[i];
            int j = i -1;
            while (j >= 0 && compare(key,arr[j])) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j +1] = key;
        }
        return arr;
    }
    @Override
    void printSort(int[] arr) {
        for (int j : arr) {
            System.out.printf(j + " ");
        }
        System.out.println();
    }

}
