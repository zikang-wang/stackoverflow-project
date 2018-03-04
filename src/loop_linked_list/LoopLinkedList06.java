package loop_linked_list;

import java.util.HashSet;
import java.util.LinkedList;

public class LoopLinkedList06 {
    class Node {
        Node next;
        // some user data
    }

    public boolean hasCycle (LinkedList<Node> list)
    {
        HashSet<Node> visited = new HashSet<Node>();

        for (Node n : list)
        {
            visited.add(n);

            if (visited.contains(n.next))
            {
                return true;
            }
        }

        return false;
    }
}
