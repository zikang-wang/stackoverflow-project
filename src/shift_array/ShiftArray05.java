package shift_array;

public class ShiftArray05 {
    public int[] shift(int[] original, int shift) {
        int[] reordered = new int[original.length];
        for(int i=0; i<original.length;i++)
            reordered[i] = original[(shift+i)%original.length];
        return reordered;
    }
}
