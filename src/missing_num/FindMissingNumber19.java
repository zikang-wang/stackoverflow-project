package missing_num;

public class FindMissingNumber19 {
    // Function to ind missing number
    public int getMissingNo (int a[], int n)
    {
        int i, total;
        total  = (n+1)*(n+2)/2;
        for ( i = 0; i< n; i++)
            total -= a[i];
        return total;
    }
}
