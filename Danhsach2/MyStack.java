package Danhsach2;

public class MyStack {
    private int arr[];
    private int size;
    private static int index = 0;

    public MyStack(int size) {
        arr = new int[this.size = size];
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is null!");
        }
        return arr[--index];
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        if (size == 0) {
            System.out.println("Arr is null");
            return true;
        }
        return false;
    }
    public boolean isFull() {
        boolean check = false;
        if (size == index) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.size());

    }

}
