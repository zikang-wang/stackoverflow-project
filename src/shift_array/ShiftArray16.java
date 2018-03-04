package shift_array;

public class ShiftArray16 {
    public void shift(int[] originalArray) {
        int lastItem = originalArray[originalArray.length - 1];

        System.arraycopy(originalArray, 0, originalArray, 1, originalArray.length - 1);
        originalArray [0] = lastItem;
    }
}
