package missing_num;

public class FindMissingNumber03 {
    public int find(int[] arr) {
        int sum = 0;
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) idx = i; else sum += arr[i];
        }
        return 5050 - sum;
    }
}
