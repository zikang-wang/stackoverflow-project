package loop_linked_list;

public class LoopLinkedList20 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        ListNode p = head,pre = head;
        while(p != null && p.next != null){
            if (p.next == head) return true;
            p = p.next;
            pre.next = head;
            pre = p;
        }
        return false;
    }
}
