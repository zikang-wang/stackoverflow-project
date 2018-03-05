package arraylist_contain_object;

import java.util.List;

public class ArrayLIstContainsObject05 {
    public boolean contains(List<Object> a, Object object) {
        int s = a.size();
        if (object != null) {
            for (int i = 0; i < s; i++) {
                if (object.equals(a.get(i))) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < s; i++) {
                if (a.get(i) == null) {
                    return true;
                }
            }
        }
        return false;
    }
}
