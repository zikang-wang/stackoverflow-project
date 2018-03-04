package missing_num;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingNumber09 {
    /**
     * The function prints all the missing numbers from "n" consecutive numbers.
     * The number of missing numbers is not given and all the numbers in the
     * given array are assumed to be unique.
     *
     * A similar approach can be used to find all no-unique/ unique numbers from
     * the given array
     *
     * @param n
     *            total count of numbers in the sequence
     * @param numbers
     *            is an unsorted array of all the numbers from 1 - n with some
     *            numbers missing.
     *
     */
    public static void findMissingNumbers(int n, int[] numbers) {

        if (n < 1) {
            return;
        }

        byte[] bytes = new byte[n / 8];
        int countOfMissingNumbers = n - numbers.length;

        if (countOfMissingNumbers == 0) {
            return;
        }

        for (int currentNumber : numbers) {

            int byteIndex = (currentNumber - 1) / 8;
            int bit = (currentNumber - byteIndex * 8) - 1;
            // Update the "bit" in bytes[byteIndex]
            int mask = 1 << bit;
            bytes[byteIndex] |= mask;
        }
        for (int index = 0; index < bytes.length - 2; index++) {
            if (bytes[index] != -128) {
                for (int i = 0; i < 8; i++) {
                    if ((bytes[index] >> i & 1) == 0) {
                        System.out.println("Missing number: " + ((index * 8) + i + 1));
                    }
                }
            }
        }
        // Last byte
        int loopTill = n % 8 == 0 ? 8 : n % 8;
        for (int index = 0; index < loopTill; index++) {
            if ((bytes[bytes.length - 1] >> index & 1) == 0) {
                System.out.println("Missing number: " + (((bytes.length - 1) * 8) + index + 1));
            }
        }

    }

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<Integer>();
        int n = 128;
        int m = 5;
        for (int i = 1; i <= n; i++) {
            arrayList.add(i);
        }
        Collections.shuffle(arrayList);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Removing:" + arrayList.remove(i));
        }
        int[] array = new int[n - m];
        for (int i = 0; i < (n - m); i++) {
            array[i] = arrayList.get(i);
        }
        System.out.println("Array is: " + Arrays.toString(array));

        findMissingNumbers(n, array);
    }

}
