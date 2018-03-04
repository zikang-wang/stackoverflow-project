package permutation;

public class Permutation13 extends Permutation {
    // https://stackoverflow.com/questions/361/generate-list-of-all-possible-permutations-of-a-string
    private void permutation(String str) {
        char[] stringArray = str.toCharArray();
        printPermutation(stringArray, 0, stringArray.length, 0, 1);
    }

    private static void printPermutation(char[] string, int loopCounter, int length, int indexFrom, int indexTo) {
        // Stop condition
        if (loopCounter == length)
            return;

    /*
     When reaching the end of the array:
     1- Reset loop indices.
     2- Increase length counter.
    */
        if (indexTo == length) {
            indexFrom = 0;
            indexTo = 1;
            ++loopCounter;
        }

        // Print.
        System.out.println(string);

        // Swap from / to indices.
        char temp = string[indexFrom];
        string[indexFrom] = string[indexTo];
        string[indexTo] = temp;

        // Go for next iteration.
        printPermutation(string, loopCounter, length, ++indexFrom, ++indexTo);
    }

    @Override
    public void run(String testStr) {
        permutation(testStr);
    }
}
