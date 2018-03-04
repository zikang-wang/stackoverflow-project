package shift_array;

import java.util.LinkedList;

public class ShiftArray08 {
    public static void shiftNumbers(int[] array) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for(int item : array) {
            linkedList.add(item);
        }
        linkedList.push(linkedList.pollLast());     // shift last to first

        int i = 0;
        for(int item : linkedList) {
            array[i++] = item;
        }
    }
}
