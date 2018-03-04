package shift_array;

public class ShiftArray19 {
    public void shift(int[] array) {
        for(int i = 0, previous_value = array[array.length]; i < array.length; i++)
        {
            int prev = array[i];
            array[i] = previous_value;
            previous_value = prev;
        }
    }
}
