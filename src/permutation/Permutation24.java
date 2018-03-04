package permutation;

import java.util.ArrayList;

public class Permutation24 {
    // https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string

    public ArrayList<String> permutations(String s) {
        ArrayList<String> out = new ArrayList<String>();
        if (s.length() == 1) {
            out.add(s);
            return out;
        }
        char first = s.charAt(0);
        String rest = s.substring(1);
        for (String permutation : permutations(rest)) {
            out.addAll(insertAtAllPositions(first, permutation));
        }
        return out;
    }

    public ArrayList<String> insertAtAllPositions(char ch, String s) {
        ArrayList<String> out = new ArrayList<String>();
        for (int i = 0; i <= s.length(); ++i) {
            String inserted = s.substring(0, i) + ch + s.substring(i);
            out.add(inserted);
        }
        return out;
    }

    public void run(String testStr) {
        for (String s : permutations(testStr))
            System.out.println(s);
    }
}
