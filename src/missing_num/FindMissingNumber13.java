package missing_num;

public class FindMissingNumber13 {
    public static int findMissing2(int [] arr){
        int sum = 0, max = 0;
        for(int n : arr){
            sum += n;
            if(n > max) max = n;
        }
        return (max*(max+1)/2) - sum;
    }
}
