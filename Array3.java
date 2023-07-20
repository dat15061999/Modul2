import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int size;
        do {
            System.out.println("Nhap size");
             size = new Scanner(System.in).nextInt();
        } while (size > 20);
        int[] array = new int[size];

        for (int i=0;i<size ; i++) {
            System.out.println("Nhap number co thu tu la " + (i +1));
            array[i] = new Scanner(System.in).nextInt();
        }
        System.out.print("Danh sach mang vua nhap la : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
        }
        System.out.println(" O vi tri : "+findMax(array));
    }
    public static int findMax(int[] arr ){
        int Max = 0;
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
                count = 1 + i ;
            }
        }
        return  count;

    }
}
