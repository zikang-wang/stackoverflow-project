package merge_array;

public class MergeSortedArray06 {
    public static int[] merge(int[] a, int[] b) {
        int[] mergedArray = new int[(a.length + b.length)];
        int i = 0, j = 0;
        int mergedArrayIndex = 0;
        for (; i < a.length || j < b.length;) {
            if (i < a.length && j < b.length) {
                if (a[i] < b[j]) {
                    mergedArray[mergedArrayIndex] = a[i];
                    i++;
                } else {
                    mergedArray[mergedArrayIndex] = b[j];
                    j++;
                }
            } else if (i < a.length) {
                mergedArray[mergedArrayIndex] = a[i];
                i++;
            } else if (j < b.length) {
                mergedArray[mergedArrayIndex] = b[j];
                j++;
            }
            mergedArrayIndex++;
        }
        return mergedArray;
    }
}
