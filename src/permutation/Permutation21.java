package permutation;

import java.util.Stack;

public class Permutation21 {
    // https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string
    /*
     * eg: abc =>{a,bc},{b,ac},{c,ab}
     * =>{ca,b},{cb,a}
     * =>cba,cab
     * =>{ba,c},{bc,a}
     * =>bca,bac
     * =>{ab,c},{ac,b}
     * =>acb,abc
     */
    public void nonRecpermute(String prefix, String word) {
        String[] currentstr = {prefix, word};
        Stack<String[]> stack = new Stack<String[]>();
        stack.add(currentstr);
        while (!stack.isEmpty()) {
            currentstr = stack.pop();
            String currentPrefix = currentstr[0];
            String currentWord = currentstr[1];
            if (currentWord.equals("")) {
                System.out.println("Word =" + currentPrefix);
            }
            for (int i = 0; i < currentWord.length(); i++) {
                String[] newstr = new String[2];
                newstr[0] = currentPrefix + String.valueOf(currentWord.charAt(i));
                newstr[1] = currentWord.substring(0, i);
                if (i < currentWord.length() - 1) {
                    newstr[1] = newstr[1] + currentWord.substring(i + 1);
                }
                stack.push(newstr);
            }

        }
    }

    public void run(String testStr) {
        nonRecpermute("", testStr);
    }
}
