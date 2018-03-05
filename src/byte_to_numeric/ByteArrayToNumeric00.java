package byte_to_numeric;

public class ByteArrayToNumeric00 {
    public long byte2numeric(byte[] by) {
        long value = 0;
        for (int i = 0; i < by.length; i++)
        {
            value += ((long) by[i] & 0xffL) << (8 * i);
        }
        return value;
    }
}
