package Example;

import Danhsach.Node;

public class Resever {
    public static void main(String[] args) {
        System.out.println("Sắp xếp Linked List");
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println("Cach duyet mang Linked List");
        ListNode current = resever(head);
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
    public static ListNode resever(ListNode head) {
        ListNode prevNode = null;
        ListNode curNode = head;
        ListNode nextNode = null;
        while (curNode!= null) {
            nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }
        return prevNode;
    }

}
