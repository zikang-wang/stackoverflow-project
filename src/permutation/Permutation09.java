package permutation;

public class Permutation09 extends Permutation {
    // https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string

    public void permute(char[] ary, int startIndex, int endIndex) {
        if(startIndex == endIndex){
            System.out.println(String.valueOf(ary));
        }else{
            for(int i=startIndex;i<=endIndex;i++) {
                swap(ary, startIndex, i );
                permute(ary, startIndex+1, endIndex);
                swap(ary, startIndex, i );
            }
        }
    }

    public void swap(char[] ary, int x, int y) {
        char temp = ary[x];
        ary[x] = ary[y];
        ary[y] = temp;
    }

    @Override
    public void run(String testStr) {
        permute(testStr.toCharArray(), 0, testStr.length()-1);
    }
}
