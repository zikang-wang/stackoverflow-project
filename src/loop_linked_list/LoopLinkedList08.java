package loop_linked_list;

public class LoopLinkedList08 {
    class Node {
        Node next;
        // some user data
    }

    Node first;
    int count;

    LoopLinkedList08(){
        first = null;
        count = 0;
    }

    LoopLinkedList08(Node n){
        if (n.next != null){
            throw new RuntimeException("must start with single node!");
        } else {
            first = n;
            count = 1;
        }
    }

    public void addNode(Node n){
        Node lookingAt = first;

        while(lookingAt.next != null){
            lookingAt = lookingAt.next;
        }

        lookingAt.next = n;
        count++;
    }

    public boolean hasLoop(){

        int counter = 0;
        Node lookingAt = first;

        while(lookingAt.next != null){
            counter++;
            if (count < counter){
                return false;
            } else {
                lookingAt = lookingAt.next;
            }
        }

        return true;

    }
}
