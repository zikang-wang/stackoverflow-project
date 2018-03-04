package shift_array;

import java.util.Arrays;
import java.util.Collections;

public class ShiftArray22 {
    public void shift(int[] array, int k) {
        Collections.rotate(Arrays.asList(array), k);
        System.out.println(Arrays.toString(array));
    }
}
