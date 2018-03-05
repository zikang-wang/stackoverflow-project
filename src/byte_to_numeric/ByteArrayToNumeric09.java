package byte_to_numeric;

import java.nio.ByteBuffer;

public class ByteArrayToNumeric09 {
    public int byte2numeric(byte[] arr) {
        ByteBuffer buff = ByteBuffer.wrap(arr);
        int i = buff.getInt(); // interprets the next 4 bytes into an int
        return i;
    }
}
