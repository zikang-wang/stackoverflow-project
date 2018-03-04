package array_max_min;

import java.util.Arrays;

public class ArrayMaxMinValue06 {
    public static float getMaxFloat(float[] data) {

        float[] copy = Arrays.copyOf(data, data.length);
        Arrays.sort(copy);
        return copy[data.length - 1];
    }

    public static float getMinFloat(float[] data) {

        float[] copy = Arrays.copyOf(data, data.length);
        Arrays.sort(copy);
        return copy[0];
    }
}
