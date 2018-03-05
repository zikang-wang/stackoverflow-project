package array_max_min;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMaxMinValue11 {
    public void find(Integer[] num)
    {

        // using Collection.min() to find minimum element
        // using only 1 line.
        int min = Collections.min(Arrays.asList(num));

        // using Collection.min() to find maximum element
        // using only 1 line.
        int max = Collections.max(Arrays.asList(num));

        // printing minimum and maximum numbers
        System.out.println("Minimum number of array is : " + min);
        System.out.println("Maximum number of array is : " + max);
    }
}
