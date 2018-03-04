package array_max_min;

import java.util.Arrays;

public class ArrayMaxMinValue07 {
    public static void main(String[] args) {
        int[] A = {2, 4, 3, 5, 5};
        Arrays.sort(A);
        int min = A[0];
        int max = A[A.length -1];
        System.out.println("Min Value = " + min);
        System.out.println("Max Value = " + max);
    }
}
