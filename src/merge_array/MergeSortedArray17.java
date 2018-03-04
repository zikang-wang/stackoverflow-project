package merge_array;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray17 {
    public static String [] mergeStrings(String [] x, String [] y) {
        List<String> mergedList = new ArrayList<String>();
        int xp = 0, yp = 0;
        while ( xp < x.length && yp < y.length){
            if (x[xp].compareTo(y[yp]) < 0) {
                mergedList.add(x[xp++]);
            } else if (x[xp].compareTo(y[yp]) > 0) {
                mergedList.add(y[yp++]);
            } else {
                mergedList.add(x[xp]);
                xp++; yp++;
            }
        }
        while (xp < x.length) {
            mergedList.add(x[xp++]);
        }
        while (yp < y.length) {
            mergedList.add(y[yp++]);
        }
        return mergedList.toArray(new String[0]);
    }
}
