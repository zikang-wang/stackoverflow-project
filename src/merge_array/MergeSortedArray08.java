package merge_array;

public class MergeSortedArray08 {
    private static int binarySearch(int[] array, int low, int high, int v) {
        high = high - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = array[mid];
            if (midVal > v)
                low = mid + 1;
            else if (midVal < v)
                high = mid - 1;
            else
                return mid; // key found
        }
        return low;//traditionally, -(low + 1);  // key not found.
    }

    private static int[] sortedArrayMerge(int a[], int b[]) {
        int result[] = new int[a.length + b.length];
        int k, i = 0, j = 0;
        if (a[0] > b[0]) {
            k = i = binarySearch(b, 0, b.length, a[0]);
            System.arraycopy(b, 0, result, 0, i);
        } else {
            k = j = binarySearch(a, 0, a.length, b[0]);
            System.arraycopy(a, 0, result, 0, j);
        }
        while (i < a.length && j < b.length) {
            result[k++] = (a[i] < b[j]) ? a[i++] : b[j++];
        }
        if (j < b.length) {
            System.arraycopy(b, j, result, k, (b.length - j));
        } else {
            System.arraycopy(a, i, result, k, (a.length - i));
        }
        return result;
    }
}
