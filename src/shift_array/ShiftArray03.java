package shift_array;

public class ShiftArray03 {
    public void shift(int[] data, int pos) {

        while (pos-- > 0) {//shift 1 right for pos number of times

            //notice the data.length-1 for the last item. data.length as index would be out of bound.
            int tmp = data[data.length - 1];

            //start from the last and keep shifting the left one to current.
            for (int i = data.length - 1; i > 1; i--) {
                data[i] = data[i - 1];
            }

            //since it's a circular shift, last one (before shifting) will shift to 1 index.
            data[1] = tmp;
        }
    }
}
