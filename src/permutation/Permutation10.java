package permutation;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation10 {
    // https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string

    public static ArrayList<String> permute(String s) {
        ArrayList<String> perms = new ArrayList<>();
        int slen = s.length();
        if (slen > 0) {
            // Add the first character from s to the perms array list.
            perms.add(Character.toString(s.charAt(0)));

            // Repeat for all additional characters in s.
            for (int i = 1;  i < slen;  ++i) {

                // Get the next character from s.
                char c = s.charAt(i);

                // For each of the strings currently in perms do the following:
                int size = perms.size();
                for (int j = 0;  j < size;  ++j) {

                    // 1. remove the string
                    String p = perms.remove(0);
                    int plen = p.length();

                    // 2. Add plen + 1 new strings to perms.  Each new string
                    //    consists of the removed string with the character c
                    //    inserted into it at a unique location.
                    for (int k = 0;  k <= plen;  ++k) {
                        perms.add(p.substring(0, k) + c + p.substring(k));
                    }
                }
            }
        }
        return perms;
    }

    public void run(String testStr) {
        for (String s : permute(testStr))
            System.out.println(s);
    }
}
