package loop_linked_list;

public class LoopLinkedList02 {
    class Node {
        Node next;
        // some user data
    }

    public boolean hasCycle(Node first) {
        Node prev = null;
        Node cur = first;
        while (cur != null) {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        boolean hasCycle = prev == first && first != null && first.next != null;

// reconstruct the list
        cur = prev;
        prev = null;
        while (cur != null) {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return hasCycle;
    }
}
