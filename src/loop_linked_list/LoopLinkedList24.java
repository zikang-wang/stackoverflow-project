package loop_linked_list;

public class LoopLinkedList24 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle2(ListNode head) {

        if(head == null || head.next == null) {
            return false;
        }

        ListNode node = head;
        while(node != null) {

            if(node.next == head) {
                return true;
            }

            ListNode temp = node.next;
            node.next = head;
            node = temp;
        }

        return false;
    }
}
