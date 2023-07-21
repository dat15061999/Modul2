package Exame;

import java.util.Arrays;

import static Exame.Sort.setSortBy;

public class View {
    static int choose;
    static MerchSort merchSort = new MerchSort();
    static InsertionSort insertionSort = new InsertionSort();
    static SelectionSort selectionSort = new SelectionSort();
    static BubbleSort bubbleSort = new BubbleSort();

    public static void main(String[] args) {
        System.out.println("Mang can sap xep");
        int[] nums = {1, 5, 3, 2, 8, 7, 6, 4};
        System.out.println(Arrays.toString(nums));
        System.out.println();
        printMenuChoose(nums);

    }

    public static void printView(int[] nums) {
        printMenu();
        choose = GetValue.getInt("Nhap lua chon");
        switch (choose) {
            case 1:
                System.out.println("Insertion sort");
                insertionSort.printSort(insertionSort.sort(nums));
                break;
            case 2:
                System.out.println("Bubble sort");
                bubbleSort.printSort(bubbleSort.sort(nums));
                break;
            case 3:
                System.out.println("Selection sort");
                selectionSort.printSort(selectionSort.sort(nums));
                break;
            case 4:
                System.out.println("Merge sort");
                merchSort.printSort(merchSort.sort(nums));
                break;
            case 5:
                System.out.println("Quick sort");
                System.out.println("Updating");
                break;
            case 6:
                System.out.println("Updating");
                break;
        }
        printMenuChoose(nums);
    }

    private static void printMenu() {
        System.out.println("1. Insertion sort");
        System.out.println("2. Bubble sort");
        System.out.println("3. Selection sort");
        System.out.println("4. Merge sort");
        System.out.println("5. Quick sort");
        System.out.println("6. Shell sort");
        System.out.println("0. Quay lai");
    }

    private static void sortMenu() {
        System.out.println("Hi! Member");
        System.out.println("1. Tang dan");
        System.out.println("2. Giam dan");
        System.out.println("0. Tro ve");
    }
//
    private static void printMenuChoose(int[] nums) {
        sortMenu();
        choose = GetValue.getInt("Nhap lua chon");
        switch (choose) {
            case 1:
                System.out.println("Sap xep tang dan");
                setSortBy(choose);
                printView(nums);
                break;
            case 2:
                System.out.println("Sap xep giam dan");
                setSortBy(choose);
                printView(nums);
                break;
            case 0:
                System.exit(0);
                break;
        }
        printMenuChoose(nums);
    }
}
