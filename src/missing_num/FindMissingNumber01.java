package missing_num;

public class FindMissingNumber01 {
    public int find(int[] arr) {
        long n = 100;
        int a[] = new int[(int)n];

//XOR of all numbers from 1 to n
// n%4 == 0 ---> n
// n%4 == 1 ---> 1
// n%4 == 2 ---> n + 1
// n%4 == 3 ---> 0

        long xor = (n % 4 == 0) ? n : (n % 4 == 1) ? 1 : (n % 4 == 2) ? n + 1 : 0;

        for (long i = 1; i <= n; i++)
        {
            xor = xor ^ a[(int)i];
        }
//Missing number
        return (int)xor;
    }
}
