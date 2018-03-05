package byte_to_numeric;

public class ByteArrayToNumeric13 {
    public static int toInt( byte[] bytes ) {
        int result = 0;
        for (int i=0; i<4; i++) {
            result = ( result << 8 ) - Byte.MIN_VALUE + (int) bytes[i];
        }
        return result;
    }
}
