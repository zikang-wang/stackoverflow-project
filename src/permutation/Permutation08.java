package permutation;

public class Permutation08 extends Permutation {
    // https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string

    public void perm(String str)
    {  char[] char_arr=str.toCharArray();
        helper(char_arr,0);
    }
    public void helper(char[] char_arr, int i)
    {
        if(i==char_arr.length-1)
        {
            // print the shuffled string
            String str="";
            for(int j=0; j<char_arr.length; j++)
            {
                str=str+char_arr[j];
            }
            System.out.println(str);
        }
        else
        {
            for(int j=i; j<char_arr.length; j++)
            {
                char tmp = char_arr[i];
                char_arr[i] = char_arr[j];
                char_arr[j] = tmp;
                helper(char_arr,i+1);
                char tmp1 = char_arr[i];
                char_arr[i] = char_arr[j];
                char_arr[j] = tmp1;
            }
        }
    }

    @Override
    public void run(String testStr) {
        perm(testStr);
    }
}
