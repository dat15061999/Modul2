package Example;

public class RemoveNode {
    public static void main(String[] args) {
        System.out.println("Xoa mot node ra khoi Linked Node");
        ListNode head = new ListNode(1);
        ListNode node1  = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        System.out.println("Danh sach ban dau");
        ListNode temp = head;
        while (temp.next != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println("Danh sach sau xoa");
        ListNode temp1 = removeElements(head,3);
        while (temp1 != null) {
            System.out.println(temp1.val);
            temp1 = temp1.next;
        }
    }
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode temp = new ListNode(0); // tao nut gia
        temp.next = head;
        ListNode prev = temp;
        while ( prev.next != null) {
            if(prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }

        }
        return temp.next;
    }
}
