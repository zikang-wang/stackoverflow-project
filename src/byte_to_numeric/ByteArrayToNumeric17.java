package byte_to_numeric;

public class ByteArrayToNumeric17 {
    // byte array to an integer with an offset
    public static int BAToI(byte b[], int offset) {
        return ((b[offset + 3] & 0xFF) << 24) |
                ((b[offset + 2] & 0xFF) << 16) |
                ((b[offset + 1] & 0xFF) << 8)  |
                (b[offset] & 0xFF);
    }
}
