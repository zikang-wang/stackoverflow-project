package byte_to_numeric;

import javax.rmi.CORBA.Util;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ByteArrayToNumeric22 {
    public static String bytesToString(byte[] b) {
        try {
            return new String(b, "UTF-8");
        }

        catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    private int toInt(byte[] b1){
        String s1 = bytesToString(b1);
        int y = Integer.parseInt(s1);
        return y;
    }
}
