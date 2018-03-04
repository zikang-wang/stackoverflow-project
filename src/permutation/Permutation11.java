package permutation;

public class Permutation11 extends Permutation {
    // https://stackoverflow.com/questions/361/generate-list-of-all-possible-permutations-of-a-string

    public void permute(int level, String permuted,
                        boolean used[], String original) {
        int length = original.length();
        if (level == length) {
            System.out.println(permuted);
        } else {
            for (int i = 0; i < length; i++) {
                if (!used[i]) {
                    used[i] = true;
                    permute(level + 1, permuted + original.charAt(i),
                            used, original);
                    used[i] = false;
                }
            }
        }
    }

    @Override
    public void run(String testStr) {
        boolean used[] = new boolean[testStr.length()];
        permute(0, "", used, testStr);
    }
}
