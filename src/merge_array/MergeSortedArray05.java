package merge_array;

public class MergeSortedArray05 {
    public int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0, bIndex = 0;

        for (int i = 0; i < result.length; i++) {
            if (aIndex < a.length && bIndex < b.length) {
                if (a[aIndex] < b[bIndex]) {
                    result[i] = a[aIndex];
                    aIndex++;
                } else {
                    result[i] = b[bIndex];
                    bIndex++;
                }
            } else if (aIndex < a.length) {
                result[i] = a[aIndex];
                aIndex++;
            } else {
                result[i] = b[bIndex];
                bIndex++;
            }
        }

        return result;
    }
}
