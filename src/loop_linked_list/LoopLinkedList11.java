package loop_linked_list;

public class LoopLinkedList11 {
    class Node {
        Node next;
        // some user data
    }

    boolean hasCycle(Node head) {

        boolean dec = false;
        Node first = head;
        Node sec = head;
        while(first != null && sec != null)
        {
            first = first.next;
            sec = sec.next.next;
            if(first == sec )
            {
                dec = true;
                break;
            }

        }
        return dec;
    }
}
