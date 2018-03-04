package merge_array;

public class MergeSortedArray09 {
    public static int[] merge(int[] listA, int[] listB) {
        int[] mergedList = new int[ listA.length + listB.length];
        int i = 0; // Counter for listA
        int j = 0; // Counter for listB
        int k = 0; // Counter for mergedList
        while (true) {
            if (i >= listA.length && j >= listB.length) {
                break;
            }
            if (i < listA.length && j < listB.length) { // If both counters are valid.
                if (listA[i] <= listB[j]) {
                    mergedList[k] = listA[i];
                    k++;
                    i++;
                } else {
                    mergedList[k] = listB[j];
                    k++;
                    j++;
                }
            } else if (i < listA.length && j >= listB.length) { // If only A's counter is valid.
                mergedList[k] = listA[i];
                k++;
                i++;
            } else if (i <= listA.length && j < listB.length) { // If only B's counter is valid
                mergedList[k] = listB[j];
                k++;
                j++;
            }
        }
        return mergedList;
    }
}
