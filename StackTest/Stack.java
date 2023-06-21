package StackTest;

public class Stack {
    private int maxSize;
    private int[] stackarray;
    private int top;

    public static void main(String[] args) {
        Stack stacks = new Stack(10);
        stacks.push(5);
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        for (int i = 0; i <= stacks.top; i++) {
            int element = stacks.stackarray[i];
            System.out.println(element);
        }
        int dow = stacks.stackarray[stacks.peek()];
        System.out.println(dow);
        int fal = stacks.stackarray[stacks.pop()];
        System.out.println(fal);
    }
    public Stack (int size) {
        maxSize = size;
        stackarray = new int[maxSize];
        top = -1;
    }
    public void push ( int element) {
        if(isFull())
            System.out.println("Stack is full!");
        else {
            stackarray[++top] = element;
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;}
        else
            return stackarray[top--];
    }
    public int peek () {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else
            return stackarray[top];
    }
    public boolean isEmpty() {
        return (top== -1) ;
    }
    public boolean isFull() {
        return (top == maxSize-1);
    }

}
