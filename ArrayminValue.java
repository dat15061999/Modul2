import java.util.Objects;

public class ArrayminValue {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 9, 2, 6, 3, -1, 5, 3, 7, 8, 9, 10};
        System.out.println("Mang nay co vi tri la : " + minValue(numbers));
    }

    public static int minValue(int[] number) {
        int Max = number[0];
        int Min = number[0];
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (Max < number[i]) {
                Max = number[i];
            }
        }
        for (int i = 0; i < number.length; i++) {
            if (Objects.equals(Max, number[i])) {
                continue;
            } else if (Min > number[i]) {
                Min = number[i];
                count = i + 1;
            }

        }
        return count;
    }
}


