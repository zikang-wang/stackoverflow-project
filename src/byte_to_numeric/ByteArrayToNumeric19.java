package byte_to_numeric;

public class ByteArrayToNumeric19 {
    public int convertByteToInt(byte[] b){
        int value= 0;
        for(int i=0;i<b.length;i++){
            int n=(b[i]<0?(int)b[i]+256:(int)b[i])<<(8*i);
            value+=n;
        }
        return value;
    }
}
