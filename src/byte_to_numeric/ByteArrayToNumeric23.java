package byte_to_numeric;

import java.nio.ByteBuffer;

public class ByteArrayToNumeric23 {
    int fromByteArray(byte[] bytes) {
        return ByteBuffer.wrap(bytes).getInt();
    }

    void test() {
       System.out.println(fromByteArray(new byte[] {0,0,1,1}));
    }
}
