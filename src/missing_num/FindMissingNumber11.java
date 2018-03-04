package missing_num;

public class FindMissingNumber11 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,6};
        int x1 = getMissingNumber(array,6);
        System.out.println("The Missing number is: "+x1);


    }
    private static int getMissingNumber(int[] array, int i) {

        int acctualnumber =0;
        int expectednumber = (i*(i+1)/2);

        for (int j : array) {
            acctualnumber = acctualnumber+j;

        }
        System.out.println(acctualnumber);
        System.out.println(expectednumber);
        return expectednumber-acctualnumber;

    }
}
