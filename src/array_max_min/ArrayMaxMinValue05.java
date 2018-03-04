package array_max_min;

import java.util.stream.IntStream;

public class ArrayMaxMinValue05 {
    public static int maxValue(final int[] intArray) {
        return IntStream.range(0, intArray.length).map(i -> intArray[i]).max().getAsInt();
    }
}
