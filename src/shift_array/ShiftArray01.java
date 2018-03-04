package shift_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShiftArray01 {
    public void shift(int[] data) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        boolean run = true;
        while(run){
            System.out.println("What would you like to shift?");
            String input = br.readLine();

            if(input.equals("quit")) break;
            else{
                int pos = Integer.parseInt(input);
                int temp = data[pos];

                for(int i = pos; i<data.length-1; i++)  {
                    data[i] = data[i+1];
                }
            }
        }
    }
}
