package merge_array;

public class MergeSortedArray11 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8,10,999};
        int[] arr2 = {1,3,5,9,100,1001};

        int[] arr3 = new int[arr1.length + arr2.length];

        int temp = 0;

        for (int i = 0; i < (arr3.length); i++) {
            if(temp == arr2.length){
                arr3[i] = arr1[i-temp];
            }
            else if (((i-temp)<(arr1.length)) && (arr1[i-temp] < arr2[temp])){
                arr3[i] = arr1[i-temp];
            }
            else{
                arr3[i] = arr2[temp];
                temp++;
            }
        }

        for (int i : arr3) {
            System.out.print(i + ", ");
        }
    }
}
