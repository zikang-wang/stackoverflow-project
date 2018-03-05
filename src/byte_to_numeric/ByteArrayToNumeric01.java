package byte_to_numeric;

import java.nio.ByteBuffer;

public class ByteArrayToNumeric01 {
    public long byte2numeric(byte[] by) {
        ByteBuffer bb = ByteBuffer.wrap(by);
        long l = bb.getLong();

        return l;
    }
}
