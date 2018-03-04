package loop_linked_list;

public class LoopLinkedList01 {
    class Node {
        Node next;
        // some user data
    }

    boolean hasLoop(Node first) {
        Node slow = first;
        Node fast = first;

        while(fast != null && fast.next != null) {
            slow = slow.next;          // 1 hop
            fast = fast.next.next;     // 2 hops

            if(slow == fast)  // fast caught up to slow, so there is a loop
                return true;
        }
        return false;  // fast reached null, so the list terminates
    }
}
