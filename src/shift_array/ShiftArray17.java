package shift_array;

public class ShiftArray17 {
    void rotateArrayLeftByOne(int array[])
    {
        // get last index of array
        int lastIndex = array.length - 1;
        // save first element
        int oldFirst = array[0];

        // copy the elements from  right to left
        for (int i = 0; i < lastIndex; i++)
            array[i] = array[i + 1];

        // put the first element last
        array[lastIndex] = oldFirst;
    }
}
