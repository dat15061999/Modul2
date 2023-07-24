package Exame;

public class QuickSort extends Sort {
    public QuickSort() {
    }

    @Override
    protected int[] sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int k = partition(arr, left, right);
        quickSort(arr, left, k - 1);
        quickSort(arr, k + 1, right);

    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (compare(arr[j],pivot)) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }


    @Override
    protected void printSort(int[] arr) {
        for (int j : arr) {
            System.out.printf(j + " ");
        }
        System.out.println();
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
