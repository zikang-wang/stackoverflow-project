package shift_array;

public class ShiftArray11 {
    public void shiftRight(int[] values){
        int temp  = values[values.length -1];
        if(values.length >= 2)
        {
            System.arraycopy(values,0,values,1, values.length -1);
        }
        values[0] = temp;
    }
}
