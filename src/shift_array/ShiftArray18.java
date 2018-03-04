package shift_array;

public class ShiftArray18 {
    void rotateArrayRightByOne(int array[])
    {
        // get last index of array
        int lastIndex = array.length - 1;
        // save last element
        int oldLast = array[lastIndex];

        // copy the elements from  left to right
        for (int i = lastIndex; i != 0; i--)
            array[i] = array[i - 1];

        // put the last element first
        array[0] = oldLast;
    }
}
