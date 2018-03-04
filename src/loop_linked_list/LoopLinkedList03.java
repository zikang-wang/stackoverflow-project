package loop_linked_list;

public class LoopLinkedList03 {
    class Node {
        Node next;
        // some user data
    }

    public static boolean hasLoop(Node root){
        if(root == null) return false;

        Node slow = root, fast = root;
        int taken = 0, limit = 2;

        while (fast.next != null) {
            fast = fast.next;
            taken++;
            if(slow == fast) return true;

            if(taken == limit){
                taken = 0;
                limit <<= 1;    // equivalent to limit *= 2;
                slow = fast;    // teleporting the turtle (to the hare's position)
            }
        }
        return false;
    }
}
