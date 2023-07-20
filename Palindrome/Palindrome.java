package Palindrome;

import java.util.*;

public class Palindrome {


   private static int count = 0;
    public static void main(String[] args) {
        String str = "abba";
        System.out.println("Chuoi kiem tra la: " + str);

        String[] str2 = str.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (String item: str2) {
            stack.push(item);
            queue.add(item);
        }
        String stackMain;
        String queueMain;

        for (int i = 0; i < str2.length; i++) {
            stackMain = stack.pop();
            queueMain = queue.poll();
            if (stackMain.equals(queueMain)) {
                count+=1;
            }
        }
        if (count>=str2.length) {
            System.out.println("La chuoi Palindroma");
        } else {
            System.out.println("It not Palindorma");
        }




    }
}
