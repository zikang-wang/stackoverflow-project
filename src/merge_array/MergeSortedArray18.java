package merge_array;

public class MergeSortedArray18 {
    public static void mergeArrays(int[] array1, int[] array2, int[] array3) {
        int one = 0;
        int two = 0;
        for (int k = 0; k < array3.length; k++) {
            if (two >= array2.length || one < array1.length && array1[one] < array2[two]) {
                array3[k] = array1[one++];
                System.out.println(array3[k]);
            }
            else if (one >= array1.length || two < array2.length && array1[one] >= array2[two]) {
                array3[k] = array2[two++];
                System.out.println(array3[k]);
            }
        }

    }
}
