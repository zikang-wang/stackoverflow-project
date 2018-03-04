package shift_array;

public class ShiftArray04 {
    private static void shiftArray(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }

        for (int p : array)
            System.out.print(p +  " ");
    }
}
