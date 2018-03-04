package shift_array;

public class ShiftArray02 {
    public void shift(int[] data) {
        int temp=data[data.length-1];
        for(int i=data.length-1;i>=1;i--)
        {
            data[i+1] = data[i];
        }
        data[0]=temp;
    }
}
