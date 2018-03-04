package array_max_min;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMaxMinValue00 {
    public static Character[] convert(char[] chars) {
        Character[] copy = new Character[chars.length];
        for(int i = 0; i < copy.length; i++) {
            copy[i] = Character.valueOf(chars[i]);
        }
        return copy;
    }

    public static void main(String[] args) {
        char[] a = {'3', '5', '1', '4', '2'};
        Character[] b = convert(a);
        System.out.println(Collections.max(Arrays.asList(b)));
    }
}
