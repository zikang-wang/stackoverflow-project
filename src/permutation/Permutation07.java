package permutation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Permutation07 extends Permutation {
    // https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string

    Set<String> permutations;
    Set<String> result = new HashSet<String>();

    public Set<String> permutation(String string) {
        permutations = new HashSet<String>();

        int n = string.length();
        for (int i = n - 1; i >= 0; i--)
        {
            shuffle(string.charAt(i));
        }
        return permutations;
    }

    private void shuffle(char c) {
        if (permutations.size() == 0) {
            permutations.add(String.valueOf(c));
        } else {
            Iterator<String> it = permutations.iterator();
            for (int i = 0; i < permutations.size(); i++) {

                String temp1;
                for (; it.hasNext();) {
                    temp1 = it.next();
                    for (int k = 0; k < temp1.length() + 1; k += 1) {
                        StringBuilder sb = new StringBuilder(temp1);

                        sb.insert(k, c);

                        result.add(sb.toString());
                    }
                }
            }
            permutations = result;
            //'result' has to be refreshed so that in next run it doesn't contain stale values.
            result = new HashSet<String>();
        }
    }

    @Override
    public void run(String testStr) {
        Set<String> result = permutation(testStr);
        Iterator<String> it = result.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
