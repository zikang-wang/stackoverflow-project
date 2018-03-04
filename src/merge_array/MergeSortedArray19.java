package merge_array;

public class MergeSortedArray19 {
    void doArrayThing(){
        //the two arrays containing the elements
        int[] array1 = {1, 3, 5, 2, 7, 5};
        int[] array2 = {3, 6, 2, 8};

        //the length of the 2 arrays
        int arrayLength1 = array1.length;
        int arrayLength2 = array2.length;

        //the length of both the arrays
        int containerArrayLength = arrayLength1 + arrayLength2;

        //the array that holds all the elements
        int[] container = new int[containerArrayLength];

        //a for loop that adds the first array elements
        for(int i = 0; i < arrayLength1; i++){
            //add the elements of the first array
            container[i] = array1[i];
        }

        //the for loop that adds the second array elements
        for(int i = 0; i < arrayLength2; i++){
            //add the second array elements on top of the first
            container[i + arrayLength1] = array2[i];
        }

        for(int i = 0; i < containerArrayLength; i++){
            //print all the elements
            System.out.println(container[i]);
        }
    }
}
