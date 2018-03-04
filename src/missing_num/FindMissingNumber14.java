package missing_num;

public class FindMissingNumber14 {
    public static int [] findMissing3(int [] arr){
        int sum = 0, max = 0, misSum;
        int [] misNums = {};//empty by default
        for(int n : arr){
            sum += n;
            if(n > max) max = n;
        }
        misSum = (max*(max+1)/2) - sum;//Sum of two missing numbers
        for(int n = Math.min(misSum, max-1); n > 1; n--){
            if(!contains(n, arr))misNums = new int[]{n, misSum-n};

        }
        return misNums;
    }
    private static boolean contains(int num, int [] arr){
        for(int n : arr){
            if(n == num)return true;
        }
        return false;
    }
}
