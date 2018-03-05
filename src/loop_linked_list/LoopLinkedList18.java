package loop_linked_list;

public class LoopLinkedList18 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        ListNode q = dummy;
        while (p != null) {
            p = p.next;
            q = q.next;
            if (p != null) {
                p = p.next;
            }
            if (p == q) return true;
        }
        return false;
    }
}
