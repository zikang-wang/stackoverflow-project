package shift_array;

import java.util.Arrays;

public class ShiftArray10 {
    public int shift(int[] datas, int position) {
        final int len = datas.length;
        int[] tmp = Arrays.copyOf(datas, position);
        System.arraycopy(datas, position, datas, 0, len - position);
        System.arraycopy(tmp, 0, datas, len - position, position);
        return position;
    }
}
