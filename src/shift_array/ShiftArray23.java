package shift_array;

public class ShiftArray23 {
    public int[] shiftLeft(int[] nums) {
        for(int i = 0, start = 0; i < nums.length; i++)
        {
            if(i == 0)
                start = nums[i];
            if(i == (nums.length -1))
            {
                nums[i] = start;
                break;
            }
            nums[i] = nums[i + 1];
        }
        return nums;
    }
}
