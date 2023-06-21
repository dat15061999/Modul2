package Generic;

public class Gener {
    public static <T> void prinfArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};
        Double[] numbers1 = {4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        String[] name = {"Heloo", "Word"};
        System.out.println("A");
        prinfArray(numbers);
        System.out.println("B");
        prinfArray(numbers1);
        System.out.println("C");
        prinfArray(name);

    }


}
