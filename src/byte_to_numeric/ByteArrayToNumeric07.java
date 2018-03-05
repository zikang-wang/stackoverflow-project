package byte_to_numeric;

import java.nio.ByteBuffer;

public class ByteArrayToNumeric07 {
    public long byte2numeric(byte[] foo) {
        ByteBuffer bb = ByteBuffer.wrap(new byte[] {0, 0, 0, 0, 0, 0, 0, 4});
        long l = bb.getLong();
        return l;
    }
}
