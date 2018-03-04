package shift_array;

public class ShiftArray00 {
    public static void ShiftNumbers(int[] array){
        int temp = array[array.length-1];
        for(int i=array.length-2; i>=0; i--){
            array[i+1]=array[i];
        }
        array[0] = temp;

    }
}
