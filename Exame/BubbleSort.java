package Exame;

public class BubbleSort extends Sort{

    @Override
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length-1;i++) {
            for (int j = 0 ; j < arr.length-1;j++) {
                if (compare(arr[j+1],arr[j])) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
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
