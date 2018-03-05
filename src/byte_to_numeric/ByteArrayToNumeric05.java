package byte_to_numeric;

public class ByteArrayToNumeric05 {
    public int byte2numeric(byte[] foo) {
        int res = 0;
        for(int i = foo.length -1, m = 1; i >=0; i--, m *= 10) {
            res += (foo[i] & 0xF) * m;
        }
        return res;
    }
}
