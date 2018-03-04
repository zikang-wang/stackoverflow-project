package permutation;

import java.util.HashSet;
import java.util.Set;

public class Permutation14 {
    // https://stackoverflow.com/questions/361/generate-list-of-all-possible-permutations-of-a-string
    public Set<String> concat(String c, Set<String> lst) {
        HashSet<String> ret_set = new HashSet<String>();
        for(String s: lst) {
            ret_set.add(c+s);
        }
        return ret_set;
    }

    public HashSet<String> all_perm(String a) {
        HashSet<String> set = new HashSet<String>();
        if(a.length() == 1) {
            set.add(a);
        } else {
            for(int i=0; i<a.length(); i++) {
                set.addAll(concat(a.charAt(i)+"", all_perm(a.substring(0, i)+a.substring(i+1, a.length()))));
            }
        }
        return set;
    }

    public void run(String testStr) {
        for (String s : all_perm(testStr))
            System.out.println(s);
    }
}
