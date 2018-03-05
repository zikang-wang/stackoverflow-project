package loop_linked_list;

public class LoopLinkedList17 {

        static Node head;

        static class Node {

            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        // Function that detects loop in the list
        boolean detectAndRemoveLoop(Node node) {
            Node slow = node, fast = node;
            while (slow != null && fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                // If slow and fast meet at same point then loop is present
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
}
