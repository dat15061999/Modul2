package Exame;

public class SelectionSort extends Sort{
    public SelectionSort() {
    }

    @Override
    public int[] sort(int[] arr) {
        for (int i = 0 ; i < arr.length-1 ; i++) {
            int max = i;
            for (int j = i +1 ; j < arr.length;j++) {
                if (compare(arr[j],arr[max])) {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    @Override
    protected void printSort(int[] arr) {
        for (int j : arr) {
            System.out.printf(j + " ");
        }
        System.out.println();
    }
}
