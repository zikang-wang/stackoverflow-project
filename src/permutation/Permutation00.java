package permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation00 extends Permutation {
    // https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string
    List<String> permute(String str) {
        if (str == null) {
            return null;
        }

        char[] chars = str.toCharArray();
        boolean[] used = new boolean[chars.length];

        List<String> res = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();

        Arrays.sort(chars);

        helper(chars, used, sb, res);

        return res;
    }

    void helper(char[] chars, boolean[] used, StringBuilder sb, List<String> res) {
        if (sb.length() == chars.length) {
            res.add(sb.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            // avoid duplicates
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) {
                continue;
            }

            // pick the character that has not used yet
            if (!used[i]) {
                used[i] = true;
                sb.append(chars[i]);

                helper(chars, used, sb, res);

                // back tracking
                sb.deleteCharAt(sb.length() - 1);
                used[i] = false;
            }
        }
    }

    @Override
    public void run(String testStr) {
        for (String s : permute(testStr))
            System.out.println(s);
    }
}
