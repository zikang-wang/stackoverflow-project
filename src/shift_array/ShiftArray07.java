package shift_array;

public class ShiftArray07 {
    public static void ShiftNumbers(int[] array){

        int last = array[0];
        int temp = array[0];
        int length = array.length;

        for(int i = 0; i < array.length; i++){

            temp = array[(i+1)%length];
            array[(i+1)%length] = last;
            last = temp;

        }
        array[0] = temp;

    }
}
