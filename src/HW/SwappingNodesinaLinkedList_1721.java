package HW;

public class SwappingNodesinaLinkedList_1721 {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        ListNode first = dummy, second = dummy;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
            first = first.next;
        }
        while (fast != null) {
            fast = fast.next;
            second = second.next;
        }
        int temp = (int) first.val;
        first.val = second.val;
        second.val = temp;
        return dummy.next;

    }

    public static void main(String[] args) {
        SwappingNodesinaLinkedList_1721 obj = new SwappingNodesinaLinkedList_1721();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(4);
        node2.next = node3;
        ListNode node4 = new ListNode(5);
        node3.next = node4;
        ListNode res = obj.swapNodes(head, 2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
