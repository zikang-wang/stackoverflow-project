package permutation;

import java.util.ArrayList;

public class Permutation22 {
    // https://stackoverflow.com/questions/46260552/recursively-computing-all-possible-permutations-of-a-string-java
    public ArrayList<String> computeAllPossiblePermutations(String str) {
        ArrayList<String> perms = new ArrayList<>();
        if (str.length() == 1) {
            perms.add(str);
        } else {
            String chr = str.substring(0,1);
            String rest = str.substring(1);
            ArrayList<String> subPerms = computeAllPossiblePermutations(rest);
            for (String s : subPerms) {
                for (int j = 0; j <= s.length(); j++) {
                    String newPerm = s.substring(0,j) + chr + s.substring(j);
                    perms.add(newPerm);
                }
            }
        }
        return perms;
    }

    public void run(String testStr) {
        for (String s : computeAllPossiblePermutations(testStr))
            System.out.println(s);
    }
}
