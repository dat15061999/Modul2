package Example;

public class LinkedListCycle {
    public static void main(String[] args) {
        System.out.println("Lien ket Linked List Vong");
    }
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode first = head;
        ListNode end = head;
        while (end != null) {
            if(end == null || end.next == null ) {
                return false;
            }
            first = first.next;
            end = end.next.next;
            if(first == end) {
                return true;
            }
        }
        return false;
    }
}
