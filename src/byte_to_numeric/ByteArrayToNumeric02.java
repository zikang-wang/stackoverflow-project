package byte_to_numeric;

import java.math.BigInteger;

public class ByteArrayToNumeric02 {
    public BigInteger byte2numeric(byte[] byteArray) {
        return new BigInteger(byteArray);
    }

    public void test() {
        System.out.println(byte2numeric(new byte[] {0, 0, 0, 1, 0, 0, 0, 4}));
        System.out.println(byte2numeric(new byte[] {0, 0, 0, 1, 0, 0, 0, 0}));
        System.out.println(byte2numeric(new byte[] {0, 0, 0, 0, 0, 0, 0, 0}));
    }
}
