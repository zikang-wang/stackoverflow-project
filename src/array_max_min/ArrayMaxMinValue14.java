package array_max_min;

import java.util.Arrays;

public class ArrayMaxMinValue14 {
    public void findMaxMin(int[] nums) {
        Arrays.sort(nums);
        System.out.println("Minimum = " + nums[0]);
        System.out.println("Maximum = " + nums[nums.length-1]);
    }
}
