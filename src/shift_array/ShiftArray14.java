package shift_array;

public class ShiftArray14 {
    public static void shift(int[] origArray, int k) {
        int size = origArray.length;
        k = k % size;
        int rightShiftedArray[] = new int[size];

        //right shift
        for(int i =0 ;i < size ; i++)
        {
            rightShiftedArray[(k + i ) % size ] = origArray[i];
        }

        System.out.println("right shifted array");
        for(int ele : rightShiftedArray)
            System.out.println(ele);

        //left shift by k
        int[] leftShiftedArray = new int[size];

        for(int i=0; i < size ; i++)
        {
            int pos = i - k;
            if(pos >= 0)
                leftShiftedArray[pos] = origArray[i];
            else
                leftShiftedArray[pos + size] = origArray[i];
        }

        System.out.println("left shifted array");
        for(int ele : leftShiftedArray)
            System.out.println(ele);
    }
}
