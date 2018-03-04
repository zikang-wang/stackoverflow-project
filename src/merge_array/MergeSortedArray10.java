package merge_array;

public class MergeSortedArray10 {
    public static byte[] merge(byte[] first, byte[] second){
        int len = first.length + second.length;
        byte[] full = new byte[len];
        System.arraycopy(first, 0, full, 0, first.length);
        System.arraycopy(second, 0, full, first.length, second.length);
        return full;
    }
}
