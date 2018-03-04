package array_max_min;

import java.util.Arrays;

public class ArrayMaxMinValue08 {
    public static <T> T getMax(T[] data) {
        T[] copy = Arrays.copyOf(data, data.length);
        Arrays.sort(copy);
        return copy[data.length - 1];
    }

    public static <T> T getMin(T[] data) {
        T[] copy = Arrays.copyOf(data, data.length);
        Arrays.sort(copy);
        return copy[0];
    }
}
