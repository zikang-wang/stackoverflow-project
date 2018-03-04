package missing_num;

public class FindMissingNumber12 {
    public static int findMissing1(int [] arr){
        int sum = 0;
        for(int n : arr){
            sum += n;
        }
        return (100*(100+1)/2) - sum;
    }
}
