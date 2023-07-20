package StackTest;

import java.util.Arrays;
import java.util.LinkedList;

public class Stack2<E> {
    private LinkedList<E> stack;

    public Stack2() {
        stack = new LinkedList<>();
    }

    public void push(E e) {
        stack.add(e);
    }

    public E pop() {
        E result = stack.getLast();
        stack.removeLast();
        return result;
    }

    public void reverseStack() {
        int start = 0;
        int end = stack.size() - 1;
        while (start < end) {
            E temp = stack.get(start);
            stack.set(start, stack.get(end));
            stack.set(end, temp);
            start++;
            end--;
        }
    }

    public int size() {
        return stack.size();
    }

    public E get(int i) {
        return stack.get(i);
    }

    public static void main(String[] args) {
        Stack2<Integer> stack = new Stack2<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        for (int i = 0; i < stack.size(); i++) {
            System.out.printf("%d",stack.get(i));
        }
        System.out.println();
        stack.reverseStack();
        for (int i = 0; i < stack.size(); i++) {
            System.out.printf("%d",stack.get(i));
        }
        System.out.println();
        String str = "dat dep trai";
        String[] strs = str.split(" ");
        Stack2<String> stackStr = new Stack2<>();
        for (String w : strs) {
            stackStr.push(w);
        }
        String[] result = new String[strs.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = stackStr.pop();
        }
        System.out.println(Arrays.toString(result));
    }
}
