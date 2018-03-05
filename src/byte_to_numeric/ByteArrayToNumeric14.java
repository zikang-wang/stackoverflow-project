package byte_to_numeric;

public class ByteArrayToNumeric14 {
    public static final long unsignedIntToLong(byte[] b)
    {
        long l = 0;
        l |= b[0] & 0xFF;
        l <<= 8;
        l |= b[1] & 0xFF;
        l <<= 8;
        l |= b[2] & 0xFF;
        l <<= 8;
        l |= b[3] & 0xFF;
        return l;
    }
}
