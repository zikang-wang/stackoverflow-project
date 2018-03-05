package byte_to_numeric;

import java.math.BigInteger;

public class ByteArrayToNumeric03 {
    public int byte2numeric(byte[] numberByte) {
        return new BigInteger(1, numberByte).intValue();
    }

    public void test() {
        System.out.println(byte2numeric(new byte[] {0, 0, 0, 1, 0, 0, 0, 4}));
        System.out.println(byte2numeric(new byte[] {0, 0, 0, 1, 0, 0, 0, 0}));
        System.out.println(byte2numeric(new byte[] {0, 0, 0, 0, 0, 0, 0, 0}));
    }
}
