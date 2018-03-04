package loop_linked_list;

public class LoopLinkedList12 {
    class Node {
        Node next;
        // some user data
    }

    public boolean isCircular(Node head) {

        if (head == null)
            return false;

        Node temp1 = head;
        Node temp2 = head;

        try {
            while (temp2.next != null) {

                temp2 = temp2.next.next.next;
                temp1 = temp1.next;

                if (temp1 == temp2 || temp1 == temp2.next)
                    return true;

            }
        } catch (NullPointerException ex) {
            return false;

        }

        return false;

    }
}
