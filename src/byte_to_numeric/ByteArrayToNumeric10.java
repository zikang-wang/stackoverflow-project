package byte_to_numeric;

import java.nio.ByteBuffer;

public class ByteArrayToNumeric10 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        //byte [] bytes = ByteBuffer.allocate(4).putInt(17291729).array();
        byte [] bytes = { 1, 7, -39, -47 };
        System.out.println(ByteBuffer.wrap(bytes).getInt());
    }
}
