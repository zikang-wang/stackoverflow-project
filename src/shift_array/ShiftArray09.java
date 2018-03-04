package shift_array;

public class ShiftArray09 {
    public void shift(int datas[], int n) {
        int[] temp = new int[datas.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = datas[(i + n) % temp.length];
        }
        datas = temp;
    }
}
