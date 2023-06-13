import java.util.Scanner;

public class Araay1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Nhap size");
            size = input.nextInt();
        } while (size > 20);
        array = new int[size];
        int i = 0;
        do {
            System.out.println(" Nhap thong so tai "+(i+1) +" :");
            array[i]= input.nextInt();
            i++;
        } while (i < array.length);
        System.out.print("Mang duoc them vao la ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
        System.out.println("\n");
        System.out.print("Mang sau khi dao la ");
        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size - 1- j];
            array[size -1 -j] = temp;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
    }
}
