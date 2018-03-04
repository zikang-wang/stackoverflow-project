package missing_num;

public class FindMissingNumber17 {
    static int missing(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++)
            result ^= (i + 1) ^ arr[i];
        return result;
    }
}
