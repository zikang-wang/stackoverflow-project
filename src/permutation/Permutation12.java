package permutation;

import java.util.Vector;

public class Permutation12 extends Permutation {
    // https://stackoverflow.com/questions/361/generate-list-of-all-possible-permutations-of-a-string
    public Vector<String> permStr(String str){

        if (str.length() == 1){
            Vector<String> ret = new Vector<String>();
            ret.add(str);
            return ret;
        }

        char start = str.charAt(0);
        Vector<String> endStrs = permStr(str.substring(1));
        Vector<String> newEndStrs = new Vector<String>();
        for (String endStr : endStrs){
            for (int j = 0; j <= endStr.length(); j++){
                if (endStr.substring(0, j).endsWith(String.valueOf(start)))
                    break;
                newEndStrs.add(endStr.substring(0, j) + String.valueOf(start) + endStr.substring(j));
            }
        }
        return newEndStrs;
    }

    @Override
    public void run(String testStr) {
        for (String s : permStr(testStr))
            System.out.println(s);
    }
}
