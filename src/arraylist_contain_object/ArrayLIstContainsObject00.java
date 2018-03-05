package arraylist_contain_object;

import java.util.Arrays;
import java.util.List;

public class ArrayLIstContainsObject00 {
    public static boolean deepContains(List<Integer[]> list, Integer[] probe) {
        for (Integer[] element : list) {
            if (Arrays.deepEquals(element, probe)) {
                return true;
            }
        }
        return false;
    }
}
