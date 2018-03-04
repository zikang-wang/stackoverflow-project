package array_max_min;

public class ArrayMaxMinValue03 {
    public static double arrayMax(double[] arr) {
        double max = Double.NEGATIVE_INFINITY;

        for(double cur: arr)
            max = Math.max(max, cur);

        return max;
    }
}
