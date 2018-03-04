package missing_num;

public class FindMissingNumber07 {
    public int execute2(int[] array) {
        int diff = Math.min(array[1]-array[0], array[2]-array[1]);
        int min = 0, max = array.length-1;
        boolean missingNum = true;
        while(min<max) {
            int mid = (min + max) >>> 1;
            int leftDiff = array[mid] - array[min];
            if(leftDiff > diff * (mid - min)) {
                if(mid-min == 1)
                    return (array[mid] + array[min])/2;
                max = mid;
                missingNum = false;
                continue;
            }
            int rightDiff = array[max] - array[mid];
            if(rightDiff > diff * (max - mid)) {
                if(max-mid == 1)
                    return (array[max] + array[mid])/2;
                min = mid;
                missingNum = false;
                continue;
            }
            if(missingNum)
                break;
        }
        return -1;
    }
}
