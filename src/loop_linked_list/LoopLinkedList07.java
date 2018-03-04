package loop_linked_list;

import java.util.TreeSet;

public class LoopLinkedList07 {
    class Node {
        Node next;
        // some user data
        public Node peek(){
            return this.next;
        }
    }

    public boolean hasLoop(Node start) {
        TreeSet<Node> set = new TreeSet<Node>();
        Node lookingAt = start;

        while (lookingAt.peek() != null) {
            lookingAt = lookingAt.next;

            if (set.contains(lookingAt)) {
                return false;
            } else {
                set.add(lookingAt);
            }

            return true;
        }
        return false;
    }
}
