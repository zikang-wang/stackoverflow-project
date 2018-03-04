package loop_linked_list;

public class LoopLinkedList14 {
    class LinkedListNode {
        LinkedListNode next;
        // some user data
    }

    public static LinkedListNode findStartOfLoop(LinkedListNode head) {
        LinkedListNode n1 = head;
        LinkedListNode n2 = head;

        // find meeting point using Tortoise and Hare algorithm
        // this is just Floyd's cycle detection algorithm
        while (n2.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
            if (n1 == n2) {
                break;
            }
        }

        // Error check - there is no meeting point, and therefore no loop
        if (n2.next == null) {
            return null;
        }

    /* Move n1 to Head. Keep n2 at Meeting Point.  Each are k steps
    /* from the Loop Start. If they move at the same pace, they must
     * meet at Loop Start. */
        n1 = head;
        while (n1 != n2) {
            n1 = n1.next;
            n2 = n2.next;
        }
        // Now n2 points to the start of the loop.
        return n2;
    }
}
