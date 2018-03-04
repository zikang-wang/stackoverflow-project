package shift_array;

public class ShiftArray15 {
    public static void reverse(int startIndex, int stopIndex, int[] array){
        while(startIndex < stopIndex){
            int temp = array[startIndex];
            array[startIndex++] = array[stopIndex];
            array[stopIndex--] = temp;
        }
    }

    public static int[] rotate(int[] array, int k){
        reverse(0, array.length - 1, array);
        reverse(0, array.length - 1 - k, array);
        reverse(array.length - k, array.length - 1, array);
        return array;
    }
}
