package TryCatch;

public class Test {
    public static void main(String[] args) {
        System.out.println(sum_odd_numbers(50));
    }
    public static int sum_odd_numbers (int n) {
        //Your code here
        if(n == 1) return n;
        if( n %2 ==0 ) {
            return sum_odd_numbers ( n -1);
        } else {
            return n + sum_odd_numbers ( n -1);
        }
    }
}
