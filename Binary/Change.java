package Binary;

import java.util.*;

public class Change {
    public static void main(String[] args) {
        int number = 30;
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }
        System.out.println("Chuyen thap phan sang nhi phan"+stack);
        int [] numbers = {1,1,0,1,0,0,0,1};
        int num = 0;
        for (int i = numbers.length-1; i >= 0 ; i--) {
             if (numbers[i] == 0) {
                 continue;
             } else {
                 num+=numbers[i]* Math.pow(2,numbers.length-1-i);
             }

        }
        System.out.println(num);
    }
}