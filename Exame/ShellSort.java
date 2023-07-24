package Exame;

public class ShellSort extends Sort{
    public ShellSort() {}

    @Override
    protected int[] sort(int[] arr) {
        int n = arr.length;
        int gap = n / 2;
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                while (compare(gap,j)&& compare(temp,arr[j-gap]) ) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
            gap /= 2;
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
