package byte_to_numeric;

public class ByteArrayToNumeric06 {
    public long byte2numeric(byte[] foo) {
        //Since it is an 'integer' essentially, it will contain ASCII values of decimal digits.
        long num = 0;  //Store number here.
        for(int i = foo.length - 1; i >= 0; i--)
        {
            num = num * 10 + (foo[i] - '0'); // or (foo[i] - 48) or (foo[i] & 0xf)
        }
        return num;
    }
}
