package byte_to_numeric;

public class ByteArrayToNumeric18 {
    public static int unsignedByteToInt(byte b) {
        return (int) b & 0xFF;
    }

    public int unsignedByteToInt(byte[] buf) {
        int i = 0;
        int pos = 0;
        i += unsignedByteToInt(buf[pos++]) << 24;
        i += unsignedByteToInt(buf[pos++]) << 16;
        i += unsignedByteToInt(buf[pos++]) << 8;
        i += unsignedByteToInt(buf[pos++]) << 0;
        return i;
    }
}
