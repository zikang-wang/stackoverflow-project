package merge_array;

public class MergeSortedArray07 {
    static public int gallopSearch(int current, int[] array, int v) {
        int d = 1;
        int seek = current - d;
        int prevIteration = seek;
        while (seek > 0) {
            if (Integer.compare(array[seek], v) <= 0) {
                break;
            }
            prevIteration = seek;
            d <<= 1;
            seek = current - d;
            if (seek < 0) {
                seek = 0;
            }
        }
        if (prevIteration != seek) {
            seek = binarySearch(array, seek, prevIteration, v);
            seek = seek >= 0 ? seek : ~seek;
        }
        return seek;
    }

    static public int binarySearch(int[] list, int fromIndex, int toIndex, int v) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = list[mid];
            int cmp = Integer.compare(midVal, v);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid;// key found
            }
        }
        return -(low + 1);// key not found.
    }

    static public int[] sortedArrayMerge(int[] a, int[] b) {
        return sortedArrayMerge(null, a, a.length, b, b.length);
    }

    static public int[] sortedArrayMerge(int[] results, int[] a, int aRead, int b[], int bRead) {
        int write = aRead + bRead, length, gallopPos;
        if ((results == null) || (results.length < write)) {
            results = new int[write];
        }
        if (aRead > 0 && bRead > 0) {
            int c = Integer.compare(a[aRead - 1], b[bRead - 1]);
            while (aRead > 0 && bRead > 0) {
                switch (c) {
                    default:
                        gallopPos = gallopSearch(aRead, a, b[bRead-1]);
                        length = (aRead - gallopPos);
                        write -= length;
                        aRead = gallopPos;
                        System.arraycopy(a, gallopPos--, results, write, length);
                        c = -1;
                        break;
                    case -1:
                        gallopPos = gallopSearch(bRead, b, a[aRead-1]);
                        length = (bRead - gallopPos);
                        write -= length;
                        bRead = gallopPos;
                        System.arraycopy(b, gallopPos--, results, write, length);
                        c = 1;
                        break;
                }
            }
        }
        if (bRead > 0) {
            if (b != results) {
                System.arraycopy(b, 0, results, 0, bRead);
            }
        } else if (aRead > 0) {
            if (a != results) {
                System.arraycopy(a, 0, results, 0, aRead);
            }
        }
        return results;
    }
}
