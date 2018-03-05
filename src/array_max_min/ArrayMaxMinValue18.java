package array_max_min;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMaxMinValue18 {
    /**
     * Utility function for System.out.println
     *
     * @param message : string to print
     */
    private static void println(String message) {
        System.out.println(message);
    }
    /**
     * Utility function for System.out.print
     *
     * @param message : string to print
     */
    private static void print(String message) {
        System.out.print(message);
    }
    /**
     * main method
     *
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        println("How many numbers you want to add to the list : ");
        //read total count entered by the user
        int totalCount = scanner.nextInt();
        println(""); //adding one blank line
        //create one arraylist to store the numbers
        ArrayList numberList = new ArrayList();
        //get the inputs from the user using a 'for' loop
        for (int i = 0; i < totalCount; i++) {
            print("Enter number " + (i + 1) + " : ");
            int number = scanner.nextInt();
            numberList.add(number);
        }
        //minimum limit and maximum limit
        int minLimit;
        int maxLimit;
        print("Enter minimum limit : ");
        minLimit = scanner.nextInt();
        print("Enter maximum limit : ");
        maxLimit = scanner.nextInt();
        int min = (int)numberList.get(0);
        int max = (int)numberList.get(0);
        //iterate through the list and find the max and min values
        for (int i = 0; i < totalCount; i++) {
            if ((int)numberList.get(i) <= maxLimit && (int)numberList.get(i) >= minLimit) {
                if ((int)numberList.get(i) > max) {
                    max = (int)numberList.get(i);
                }
                if ((int)numberList.get(i) < min) {
                    min = (int)numberList.get(i);
                }
            }
        }
        //print the min and max values
        println("Minimum value in the list : " + min);
        println("Maximum value in the list : " + max);
    }
}
