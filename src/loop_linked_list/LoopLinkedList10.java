package loop_linked_list;

public class LoopLinkedList10 {
    class LinkedNode {
        LinkedNode next;
        // some user data
    }

    public static boolean checkLoopInLinkedList(LinkedNode root){

        if (root == null || root.next == null) return false;

        LinkedNode current1 = root, current2 = root.next, current3 = root.next.next;
        root.next = null;
        current2.next = current1;

        while(current3 != null){
            if(current3 == root) return true;

            current1 = current2;
            current2 = current3;
            current3 = current3.next;

            current2.next = current1;
        }
        return false;
    }
}
