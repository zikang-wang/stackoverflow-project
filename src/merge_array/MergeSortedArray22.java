package merge_array;

import java.util.ArrayList;

public class MergeSortedArray22 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 1, 5, 3 };
        int[] b = { 4, 3, 1, 5, 7, 8, 4, 2 };

        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < (a.length > b.length ? a.length : b.length); i++) {
            if (i < a.length) {
                int c = 0;
                while (c <= l.size()) {
                    if (l.contains(a[i]) == false) {
                        l.add(a[i]);
                    }
                    c++;
                }
            }
            if (i < b.length) {
                int c = 0;
                while (c <= l.size()) {
                    if (l.contains(b[i]) == false) {
                        l.add(b[i]);
                    }
                    c++;
                }

            }
        }
        System.out.println(l);
    }
}
