package TryCatch;

public class Main {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(25));
    }
    public static int binarySearch(int key) {
        int left =0;
        int right= key/2;
        int mid;
        if(key == 1) return -1;
        while (left<=right) {
             mid = (left+right)/2;
            if(mid*mid > key) {
                right = mid -1;
            } else if (mid*mid < key) {
                left = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
