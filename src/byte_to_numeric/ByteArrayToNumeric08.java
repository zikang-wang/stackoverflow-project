package byte_to_numeric;

public class ByteArrayToNumeric08 {
    public long byte2numeric(byte[] b) {
        int l = 0;
        for(int i =0; i < 4; i++){
            l <<= 8;
            l ^= (long)b[i] & 0xFF;
        }
        return l;
    }
}
