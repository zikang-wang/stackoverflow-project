package shift_array;

public class ShiftArray21 {
    public void shift(int[] array) {
        for(int i = 0; i < array.length; i++) array[i] = i;

        int temp = array[array.length-1];

        for(int i = array.length-1; i > 0; i--) array[i] = array[i-1];

        array[0] = temp;
    }
}
