package array_max_min;

import java.util.Scanner;

public class ArrayMaxMinValue09 {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int [] numbers = new int[5];
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Enter your next number:");
            numbers[i] = kb.nextInt();
            if (numbers[i] > max)
            {
                max = numbers[i];
            }
            if (min > numbers[i])
            {
                min = numbers[i];
            }
        }

        System.out.println("The maximum value in your array is " + max);
        System.out.println("The minimum value in your array is " + min);
    }
}
