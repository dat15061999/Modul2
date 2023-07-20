package Exame;

public class SelectionSort extends Sort<SelectionSort>{
    public SelectionSort() {
    }

    @Override
    int[] ascending(int[] str) {
        for (int i = 0 ; i < str.length-1 ; i++) {
            int max = i;
            for (int j = i +1 ; j < str.length;j++) {
                if (str[max] < str[j]) {
                    max = j;
                }
            }
            int temp = str[max];
            str[max] = str[i];
            str[i] = temp;
        }
        return str;

    }

    @Override
    int[] decrease(int[] str) {
        for (int i = 0 ; i < str.length-1 ; i++) {
            int min = i;
            for (int j = i +1 ; j < str.length;j++) {
                if (str[min] > str[j]) {
                    min = j;
                }
            }
            int temp = str[min];
            str[min] = str[i];
            str[i] = temp;
        }
        return str;
    }

    @Override
    void printSort(int[] arr) {
        for (int i = 0; i < arr.length-1;i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
