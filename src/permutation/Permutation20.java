package permutation;

import java.util.ArrayList;

public class Permutation20 {
    // https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string
    ArrayList al = new ArrayList();

    private void findPermutation (String str){
        for (int k = 0; k < str.length(); k++) {
            addOneChar(str.charAt(k));
        }
    }

    //insert one char into ArrayList
    private void addOneChar(char ch){
        String lastPerStr;
        String tempStr;
        ArrayList locAl = new ArrayList();
        for (int i = 0; i < al.size(); i ++ ){
            lastPerStr = al.get(i).toString();
            //System.out.println("lastPerStr: " + lastPerStr);
            for (int j = 0; j <= lastPerStr.length(); j++) {
                tempStr = lastPerStr.substring(0,j) + ch +
                        lastPerStr.substring(j, lastPerStr.length());
                locAl.add(tempStr);
                //System.out.println("tempStr: " + tempStr);
            }
        }
        if(al.isEmpty()){
            al.add(ch);
        } else {
            al.clear();
            al = locAl;
        }
    }

    public void run(String testStr) {
        findPermutation(testStr);
        for (Object o : al)
            System.out.println(o.toString());
    }
}
