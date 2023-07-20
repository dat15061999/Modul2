public class Test2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
        int num = 6;
        System.out.println(getIndex(numbers, num));
    }

    public static int getIndex(int[] numbers, int num) {
        int right = numbers.length - 1;
        int left = 0;

        while (left <= right) {
            int mid = (right + left) / 2;
            if (num < numbers[mid]) {
                right = mid - 1;
            } else if (num == numbers[mid]) {
                return mid;
            } else
                left = mid + 1;
        }
        return -1;

    }
}
