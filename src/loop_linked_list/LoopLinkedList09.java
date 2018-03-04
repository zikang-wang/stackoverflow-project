package loop_linked_list;

public class LoopLinkedList09 {
    class Node {
        Node next;
        // some user data
    }

    // To detect whether a circular loop exists in a linked list
    public boolean findCircularLoop(Node head) {
        Node slower, faster;
        slower = head;
        faster = head.next; // start faster one node ahead
        while (true) {

            // if the faster pointer encounters a NULL element
            if (faster == null || faster.next == null)
                return false;
                // if faster pointer ever equals slower or faster's next
                // pointer is ever equal to slower then it's a circular list
            else if (slower == faster || slower == faster.next)
                return true;
            else {
                // advance the pointers
                slower = slower.next;
                faster = faster.next.next;
            }
        }
    }
}
