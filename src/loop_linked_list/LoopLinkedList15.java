package loop_linked_list;

import java.util.IdentityHashMap;
import java.util.Map;

public class LoopLinkedList15 {
    class LinkedListNode {
        LinkedListNode next;
        // some user data
    }

    public static LinkedListNode findHeadOfLoop(LinkedListNode head) {

        int indexer = 0;
        Map<LinkedListNode, Integer> map = new IdentityHashMap<LinkedListNode, Integer>();
        map.put(head, indexer);
        indexer++;

        // start walking along the list while putting each node in the HashMap
        // if we come to a node that is already in the list,
        // then that node is the start of the cycle
        LinkedListNode curr = head;
        while (curr != null) {

            if (map.containsKey(curr.next)) {
                curr = curr.next;
                break;
            }
            curr = curr.next;
            map.put(curr, indexer);
            indexer++;
        }
        return curr;
    }
}
