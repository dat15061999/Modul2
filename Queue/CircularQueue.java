package Queue;

import java.util.NoSuchElementException;

public class CircularQueue<E> {
    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<E> front;
    private Node<E> rear;

    public CircularQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(E data) {
        Node<E> newNode = new Node<>(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        rear.next = front;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        E data = front.data;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }
        return data;
    }

    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        int count = 1;
        Node<E> current = front;
        while (current != rear) {
            current = current.next;
            count++;
        }
        return count;
    }
}