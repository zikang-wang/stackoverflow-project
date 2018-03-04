package shift_array;

public class ShiftArray20 {
    public void shift(int[] array) {
        int n = array.length;
        int last = array[n-1];    //copy last element into buffer thus creating an empty slot
        for(int i=n-1;i>0;i--)    //iterate from end to begin
        {
            array[i] = array[i-1]; //push previous element into current location(an empty slot)
        }
        array[0] = last;
    }
}
