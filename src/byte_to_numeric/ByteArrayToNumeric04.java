package byte_to_numeric;

public class ByteArrayToNumeric04 {
    private int unsignedIntFromByteArray(byte[] bytes) {
        int res = 0;
        if (bytes == null)
            return res;


        for (int i=0;i<bytes.length;i++){
            res = res | ((bytes[i] & 0xff) << i*8);
        }
        return res;
    }
}
