package merge_array;

import java.util.Comparator;
import java.util.List;

public class MergeSortedArray16 {
    /**
     * Inserts the value keeping collection sorted, provided collections shall be sorted with provided
     * comparator
     */
    public static <E> void sortedInsert(List<E> list, E value, Comparator<? super E> comparator) {

        if (list.size() == 0) {
            list.add(value);
        } else if (comparator.compare(list.get(0), value) > 0) {
            list.add(0, value);
        } else if (comparator.compare(list.get(list.size() - 1), value) < 0) {
            list.add(list.size(), value);
        } else {
            int i = 0;
            while (comparator.compare(list.get(i), value) < 0) {
                i++;
            }
            list.add(i, value);
        }
    }
}
