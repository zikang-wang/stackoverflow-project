package permutation;

import java.util.ArrayList;

public class Permutation19 {
    // https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string
    public ArrayList<String> strPerm(String str, ArrayList<String> list)
    {
        int len = str.length();
        if(len==1){
            list.add(str);
            return list;
        }

        list = strPerm(str.substring(0,len-1),list);
        int ls = list.size();
        char ap = str.charAt(len-1);
        for(int i=0;i<ls;i++){
            String temp = list.get(i);
            int tl = temp.length();
            for(int j=0;j<=tl;j++){
                list.add(temp.substring(0,j)+ap+temp.substring(j,tl));
            }
        }

        while(true){
            String temp = list.get(0);
            if(temp.length()<len)
                list.remove(temp);
            else
                break;
        }

        return list;
    }

    public void run(String testStr) {
        for (String s : strPerm(testStr, new ArrayList<String>()))
            System.out.println(s);
    }
}
