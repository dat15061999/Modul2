package Exame;

public class BubbleSort extends Sort<BubbleSort>{
    public BubbleSort() {}

    @Override
    int[] ascending(int[] str) {
        for (int i = 0; i < str.length-1;i++) {
            for (int j = 0 ; j < str.length-1;j++) {
                if (str[j] < str[j+1]) {
                    int temp = str[j+1];
                    str[j+1] = str[j];
                    str[j] = temp;
                }
            }
        }
        return super.ascending(str);
    }

    @Override
    int[] decrease(int[] str) {
        for (int i = 0; i < str.length-1;i++) {
            for (int j = 0 ; j < str.length-1;j++) {
                if (str[j] > str[j+1]) {
                    int temp = str[j+1];
                    str[j+1] = str[j];
                    str[j] = temp;
                }
            }
        }
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
