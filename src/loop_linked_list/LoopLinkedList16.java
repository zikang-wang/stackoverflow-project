package loop_linked_list;

import java.util.ArrayList;
import java.util.List;

public class LoopLinkedList16 {
    class ListNode {
        ListNode next;
        // some user data
    }

    public boolean hasCycle(ListNode head) {
        //create a list that will contain the elements that have been visited
        List<ListNode> ref = new ArrayList<ListNode>();

        ListNode element = head;
        //add the first element to the list
        ref.add(head);

        boolean contains = false;

        //the special case when the linkedlist is empty
        if(head==null)
            return false;
        while(contains == false){
            if(element.next!=null && !ref.contains(element.next)){
                ref.add(element.next);
                element = element.next;
                contains = false;
            }
            else if (ref.contains(element.next))
                contains = true;
            else if(element.next == null)
                return false;
        }
        return contains;
    }
}
