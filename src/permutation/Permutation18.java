package permutation;

public class Permutation18 extends Permutation {
    // https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string
    public int facts(int x){
        int sum = 1;
        for (int i = 1; i < x; i++) {
            sum *= (i+1);
        }
        return sum;
    }

    public void permutation(String str) {
        char[] str2 = str.toCharArray();
        int n = str2.length;
        int permutation = 0;
        if (n == 1) {
            System.out.println(str2[0]);
        } else if (n == 2) {
            System.out.println(str2[0] + "" + str2[1]);
            System.out.println(str2[1] + "" + str2[0]);
        } else {
            for (int i = 0; i < n; i++) {
                if (true) {
                    char[] str3 = str.toCharArray();
                    char temp = str3[i];
                    str3[i] = str3[0];
                    str3[0] = temp;
                    str2 = str3;
                }

                for (int j = 1, count = 0; count < facts(n-1); j++, count++) {
                    if (j != n-1) {
                        char temp1 = str2[j+1];
                        str2[j+1] = str2[j];
                        str2[j] = temp1;
                    } else {
                        char temp1 = str2[n-1];
                        str2[n-1] = str2[1];
                        str2[1] = temp1;
                        j = 1;
                    } // end of else block
                    permutation++;
                    System.out.print("permutation " + permutation + " is   -> ");
                    for (int k = 0; k < n; k++) {
                        System.out.print(str2[k]);
                    } // end of loop k
                    System.out.println();
                } // end of loop j
            } // end of loop i
        }
    }

    @Override
    public void run(String testStr) {
        permutation(testStr);
    }
}
