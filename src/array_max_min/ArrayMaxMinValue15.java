package array_max_min;

public class ArrayMaxMinValue15 {
    //Find maximum (largest) value in array using recursion
    public static int getMaximumValueUsingRecursion(int[] numbers, int a, int n){
        return a>=numbers.length?n:Math.max(n,getMaximumValueUsingRecursion(numbers,a+1,numbers[a]>n?numbers[a]:n));
    }
    //Find minimum (lowest) value in array using recursion
    public static int getMinimumValueUsingRecursion(int[] numbers, int a, int n) {
        return a==numbers.length?n:Math.min(n,getMinimumValueUsingRecursion(numbers,a+1,numbers[a]<n?numbers[a]:n));
    }
}
