package byte_to_numeric;

public class ByteArrayToNumeric11 {
    public static final int INVALID_DATA = -1;
    protected long readLong(byte[] bytes) {
        if (bytes != null) {
            long value = 0;
            value += (long) (bytes[7] & 0x000000FF) << 56;
            value += (long) (bytes[6] & 0x000000FF) << 48;
            value += (long) (bytes[5] & 0x000000FF) << 40;
            value += (long) (bytes[4] & 0x000000FF) << 32;
            value += (bytes[3] & 0x000000FF) << 24;
            value += (bytes[2] & 0x000000FF) << 16;
            value += (bytes[1] & 0x000000FF) << 8;
            value += (bytes[0] & 0x000000FF);
            return value;
        }
        return INVALID_DATA;
    }
}
