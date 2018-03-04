package missing_num;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber18 {
    static Set<Integer> missing(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= arr.length; i++)
            set.add(i);
        for (int a : arr)
            set.remove(a);
        return set;
    }
}
