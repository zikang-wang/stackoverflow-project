package missing_num;

public class FindMissingNumber06 {
    public int getMissingNumber(int[] sortedArray)
    {
        int missingNumber = 0;
        int missingNumberIndex=0;
        for (int i = 0; i < sortedArray.length; i++)
        {
            if (sortedArray[i] == 0)
            {
                missingNumber = (sortedArray[i + 1]) - 1;
                missingNumberIndex=i;
                System.out.println("missingNumberIndex: "+missingNumberIndex);
                break;
            }
        }
        return missingNumber;
    }
}
