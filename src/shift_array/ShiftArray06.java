package shift_array;

public class ShiftArray06 {
    public static int[] revisedShiftNumbers(int[] array) {
        int[] newArr = new int[array.length];
        System.arraycopy(array, 0, newArr, 1, array.length - 1);
        newArr[0]=array[array.length-1];
        return newArr;
    }
}
