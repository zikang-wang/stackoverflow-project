package array_max_min;

public class ArrayMaxMinValue10 {
    // getting the maximum value
    public static int getMaxValue(int[] array){
        int maxValue = array[0];
        for(int i=1;i < array.length;i++){
            if(array[i] > maxValue){
                maxValue = array[i];

            }
        }
        return maxValue;
    }

    // getting the miniumum value
    public static int getMinValue(int[] array){
        int minValue = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }
}
