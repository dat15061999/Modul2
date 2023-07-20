package ArrayQueue;

import java.util.ArrayList;
import java.util.Arrays;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }
    public boolean isQueueFull () {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }
    public boolean isEmpty() {
        boolean status = false;
        if(currentSize == 0 ) {
            status = true;
        }
        return status;
    }
    public void enqueue( int item ) {
        if (isQueueFull()) {
            System.out.println("Unable to add element: " + item);
        } else {
            tail++;
            if (tail == capacity-1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Add item successful");
        }
    }
    public void dequeue () {
        if (isEmpty()) {
            System.out.println("Cant apply item");
        }
        else {
            head++;
            if (head == capacity - 1 ) {
                System.out.println("Pop operation success! removed :" + queueArr[head-1]);
                head=0;
            } else  {
                System.out.println("Pop operation success! removed :" + queueArr[head-1]);
            }
            currentSize--;
        }
    }
    @Override
    public String toString() {
        return "Giá trị của đối tượng MyQueue"; // thay "Giá trị của đối tượng MyQueue" bằng giá trị thực tế của đối tượng
    }
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        queue.enqueue(90);



    }
}
