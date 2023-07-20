package Danhsach2;

import java.util.LinkedList;

public class MyLinkedList<E> {
    private static class Node {
        protected Node next;
        protected Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
    }

    public int size() {
        return numNodes;
    }

    public void add(E e, int index) {
        validateIndex(index);
        if (index == 0) {
            addFirst(e);
        } else {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(e);
            temp.next.next = holder;
            numNodes++;
        }
    }

    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public E remove(int index) {
        validateIndex(index);
        Node temp = head;
        Object data;
        if (index == 0) {
            data = temp.data;
            head = head.next;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
        }
        numNodes--;
        return (E) data;
    }

    public boolean remove(E e) {
        if (head.data == e) {
            remove(0);
            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(e)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }
    public MyLinkedList<E> clone(){
        if(numNodes==0) {
            throw new NullPointerException();
        }
        MyLinkedList<E> newlist = new MyLinkedList<>();
        Node temp = head;
        newlist.addFirst((E) head.data);
        temp=temp.next;
        while (temp.next!=null) {
            newlist.addLast((E) temp.next.data);
            temp=temp.next;
        }
        return newlist;
    }
    public Object get(int i) {
        validateIndex(i);
        Node temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public boolean contains(E o) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(o)) {
                return true;
            }
            ;
            temp = temp.next;
        }
        if (temp.data.equals(0)) {
            return true;
        }
        return false;
    }

    public void ensureCapacity() {
        if (numNodes > 0) ;
    }

    public void validateIndex(int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException(String.format("Invalid index %d for list of size %d", index, numNodes));
        }
    }

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Helo", 0);
        list.add("Alo", 1);
        list.add("Hi", 2);
        list.add("HIHI", 3);
        list.add("E", 4);
        list.addFirst("hihhhii");
        list.remove(4);

        Node current = list.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
