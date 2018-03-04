package permutation;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Permutation17 extends Permutation {
    // https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string
    public Set<String> permutate(String s){
        Queue<String> permutations = new LinkedList<String>();
        Set<String> v = new HashSet<String>();
        permutations.add(s);

        while(permutations.size()!=0){
            String str = permutations.poll();
            if(!v.contains(str)){
                v.add(str);
                for(int i = 0;i<str.length();i++){
                    String c = String.valueOf(str.charAt(i));
                    permutations.add(str.substring(i+1) + c +  str.substring(0,i));
                }
            }
        }
        return v;
    }

    @Override
    public void run(String testStr) {
        for (String s : permutate(testStr))
            System.out.println(s);
    }
}
