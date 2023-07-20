public class Test1 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 10, 12, 54, 23};
        int num = 4;
        System.out.println(getIndex(numbers, num));

    }

    public static int getIndex(int[] numbers, int num) {
        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                return i;
            }
        }
        return -1;
    }
}
