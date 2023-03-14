package HW;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergekSortedLists_23 {
   public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return merge(lists, 0, lists.length - 1);

    }

    private ListNode merge(ListNode[] lists, int i, int i1) {
        if (i == i1) return lists[i];
        int mid = i + (i1 - i) / 2;
        ListNode l1 = merge(lists, i, mid);
        ListNode l2 = merge(lists, mid + 1, i1);
        return mergeTwoLists(l1, l2);
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l2.val == l1.val) {
                cur.next = l2;
                l2 = l2.next;
            } else {
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }
        if (l1 != null) cur.next = l1;
        if (l2 != null) cur.next = l2;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);
        ListNode[] lists = new ListNode[]{l1, l2, l3};
        MergekSortedLists_23 m = new MergekSortedLists_23();
        ListNode res = m.mergeKLists(lists);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
