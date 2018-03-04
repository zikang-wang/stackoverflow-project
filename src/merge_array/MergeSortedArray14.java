package merge_array;

import java.util.Arrays;

public class MergeSortedArray14 {
    public static int[] mergeSorted(int[] left, int[] right) {
        System.out.println("merging " + Arrays.toString(left) + " and " + Arrays.toString(right));
        int[] merged = new int[left.length + right.length];
        int nextIndexLeft = 0;
        int nextIndexRight = 0;
        for (int i = 0; i < merged.length; i++) {
            if (nextIndexLeft >= left.length) {
                System.arraycopy(right, nextIndexRight, merged, i, right.length - nextIndexRight);
                break;
            }
            if (nextIndexRight >= right.length) {
                System.arraycopy(left, nextIndexLeft, merged, i, left.length - nextIndexLeft);
                break;
            }
            if (left[nextIndexLeft] <= right[nextIndexRight]) {
                merged[i] = left[nextIndexLeft];
                nextIndexLeft++;
                continue;
            }
            if (left[nextIndexLeft] > right[nextIndexRight]) {
                merged[i] = right[nextIndexRight];
                nextIndexRight++;
                continue;
            }
        }
        System.out.println("merged : " + Arrays.toString(merged));
        return merged;
    }
}
