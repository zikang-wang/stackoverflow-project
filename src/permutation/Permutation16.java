package permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutation16 {
    // https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string
    private static List<String> permutations(String s) {
        // TODO Auto-generated method stub
        List<String> combinations=new ArrayList<String>();
        if(s.length()==1){
            combinations.add(s);
        }
        else{
            for(int i=0;i<s.length();i++){
                List<String>temp=permutations(s.substring(0, i)+s.substring(i+1));
                for (String string : temp) {
                    combinations.add(s.charAt(i)+string);
                }
            }
        }
        return combinations;
    }

    public void run(String testStr) {
        for (String s : permutations(testStr))
            System.out.println(s);
    }
}
