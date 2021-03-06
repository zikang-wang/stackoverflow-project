package loop_linked_list;

public class LoopLinkedList05 {
    class Node {
        Node next;
        // some user data
    }

    public boolean hasLoop(Node first) {

        if(first == null) // list does not exist..so no loop either.
            return false;

        Node slow, fast; // create two references.

        slow = fast = first; // make both refer to the start of the list.

        while(true) {
            slow = slow.next;          // 1 hop.
            if(fast.next == null)
                fast = null;
            else
                fast = fast.next.next; // 2 hops.

            if(fast == null) // if fast hits null..no loop.
                return false;

            if(slow == fast) // if the two ever meet...we must have a loop.
                return true;
        }
    }
}
