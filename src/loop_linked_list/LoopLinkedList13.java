package loop_linked_list;

public class LoopLinkedList13 {
    class Node {
        Node next;
        // some user data
    }

    boolean detectLoop(Node head){
        Node fastRunner = head;
        Node slowRunner = head;
        while(fastRunner != null && slowRunner !=null && fastRunner.next != null){
            fastRunner = fastRunner.next.next;
            slowRunner = slowRunner.next;
            if(fastRunner == slowRunner){
                return true;
            }
        }
        return false;
    }
}
