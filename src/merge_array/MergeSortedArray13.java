package merge_array;

import java.util.Arrays;

public class MergeSortedArray13 {
    public static int[] mergesort(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0, duplicateCount = 0;

        while (i < a.length || j < b.length) {
            if (i < a.length && j < b.length) {
                if (a[i] == b[j]) {
                    c[k] = a[i];
                    i++;j++;duplicateCount++;
                } else {
                    c[k] = a[i] < b[j] ? a[i++] : b[j++];
                }
            } else if (i < a.length) {
                c[k] = a[i++];
            } else if (j < a.length) {
                c[k] = b[j++];
            }
            k++;
        }

        return Arrays.copyOf(c, c.length - duplicateCount);
    }
}
