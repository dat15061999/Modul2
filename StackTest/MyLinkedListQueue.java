package StackTest;

import Danhsach2.MyLinkedList;

public class MyLinkedListQueue {
    class Node {
        public int key;
        public Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public MyLinkedListQueue() {
        this.head =null;
        this.tail =null;
    }
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
    public Node dequeue() {
        if(this.head == null ) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return temp;
    }

    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        MyLinkedListQueue.Node current = queue.head;
        while (current != null) {
            System.out.println(current.key);
            current = current.next;
        }
    }
}
