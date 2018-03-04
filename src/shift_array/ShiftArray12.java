package shift_array;

public class ShiftArray12 {
    public static void shiftRight(int[] array) {

        int max = array[array.length - 1]; /*this value stores the max INDEX (not the value of the MAX index)*/

  /*- i starts at the index before the last index of the array
    - the for loop will exit once i is less than zero
    - keep in mind, we are working with the indexes and not the actual values */

        for (int i = array.length - 2; i >= 0; i--) {
            array[i+1] = array[i]; /* takes the array value at the max index and replaces it with the array index before it */
        }

        array[0] = max; /*setting the highest index to the first index of the array */
    }
}
