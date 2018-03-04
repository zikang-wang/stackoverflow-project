package merge_array;

public class MergeSortedArray12 {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        int i = 0, j = 0;

        while (i < a1.length && j < a2.length) {
            res[i + j] = a1[i] < a2[j] ? a1[i++] : a2[j++];
        }

        while (i < a1.length) {
            res[i + j] = a1[i++];
        }

        while (j < a2.length) {
            res[i + j] = a2[j++];
        }

        return res;
    }
}
