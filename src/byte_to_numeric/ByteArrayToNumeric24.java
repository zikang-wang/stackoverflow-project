package byte_to_numeric;

public class ByteArrayToNumeric24 {

    // packing an array of 4 bytes to an int, big endian
    int fromByteArray(byte[] bytes) {
        return bytes[0] << 24 | (bytes[1] & 0xFF) << 16 | (bytes[2] & 0xFF) << 8 | (bytes[3] & 0xFF);
    }

    void test() {
        System.out.println(fromByteArray(new byte[] {0,0,1,1}));
    }
}
