package arraylist_contain_object;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIstContainsObject04 {
    public boolean contain(List<Object> list, Object obj) {
        return list.contains(obj);
    }

    public void test() {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add("abc");
        list.add(3.45);
        System.out.println(contain(list,0));
        System.out.println(contain(list,3.45));
    }
}
