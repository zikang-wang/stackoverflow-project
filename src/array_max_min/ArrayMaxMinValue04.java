package array_max_min;

import java.util.Random;

public class ArrayMaxMinValue04 {
    public static void main(String[] args) {
        int a[] = new int [100];
        Random rnd = new Random();

        for (int i = 0; i< a.length; i++) {
            a[i] = rnd.nextInt(99-0)+0;
            System.out.println(a[i]);
        }

        int max = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = max;


            for (int j = i+1; j<a.length; j++) {
                if (a[j] > max) {
                    max = a[j];
                }

            }
        }

        System.out.println("Max element: " + max);
    }
}
