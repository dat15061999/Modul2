import java.util.Arrays;
import java.util.Scanner;

public class ArrayMatrix {
    public static void main(String[] args) {
        System.out.println("Hang doc cua mang la 2");
        System.out.println("Nhap size hang ngang cua numbers la");
        int size = new Scanner(System.in).nextInt();
//        int[][] numbers = {
//                {1, 2, 30, 5, 6, 7, 8},
//                {4, 6, 3, 4, 50, 10, 15}
//        };
        int[][] numbers = number(2,size);
        System.out.println("Mang Number la : " + Arrays.deepToString(numbers));
        System.out.println("Max la : " + Arrays.toString(maxValue(numbers)));
        System.out.println("Min la : " + Arrays.toString(minValue(numbers)));
    }
    static int[] maxValue(int [][] arr) {
        int positionmaxX = 0;
        int positionmaxY = 0;
        int [] positon = new int[3];
        int Max = arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (Max < arr[i][j]) {
                    Max = arr[i][j];
                    positionmaxX = i;
                    positionmaxY = j;
                }
            }
           positon[0] = Max;
           positon[1] = positionmaxX;
           positon[2] = positionmaxY;

        }
        return positon;
    };
    static int[] minValue(int [][] arr) {
        int positionX = 0;
        int positionY = 0;
        int [] position = new int[3];
        int Min = arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (Min > arr[i][j]) {
                    Min = arr[i][j];
                    positionX = i ;
                    positionY = j ;
                }
            }
            position[0] = Min;
            position[1] = positionX;
            position[2] = positionY;
        }
        return position;
    };
    static int[][] number(int a,int b){
        int [][] number1 = new int[a][b];
        int i =0;
        int j =0;
        while ( i < a) {
            System.out.println("Hang doc " +(i +1));
            do {
                System.out.println("Nhap number vao hang ngang mang la " + (j +1));
                number1[i][j]= new Scanner(System.in).nextInt();
                j++;
            } while (j < b );
            i++;
            j =0;
        }

        return number1;
    };
}
