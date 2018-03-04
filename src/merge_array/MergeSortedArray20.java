package merge_array;

public class MergeSortedArray20 {
    public static void main(String[] args)
    {
        //sample problem
        int[] arrayA = {2,3,5,5,8,10,11,17,18,20};
        int[] arrayB = {5,6,7,8,14,15,17};
        final int sizeA = arrayA.length;
        final int sizeB = arrayB.length;
        final int sizeC = sizeA+sizeB;
        int[] arrayC = new int[sizeC];
        int countA = 0;
        int countB = 0;
        int countC = 0;
        for (countC = 0; countC < sizeC; countC++)
        {
            // if a has run out, fill with b
            if (countA == sizeA && countB < sizeB)
            {
                arrayC[countC] = arrayB[countB];
                countB++;
            }
            // if b has run out, fill with a
            else if (countA < sizeA && countB == sizeB)
            {
                arrayC[countC] = arrayA[countA];
                countA++;
            }
            // countA < sizeA && countB < sizeB because
            // if countA == sizeA && countB == sizeB then also countC == sizeC
            // and the for-loop would have stopped.
            else
            {
                // mind, if arrayA[countA] == arrayB[countB] then first
                // a will be added and on the next pass b will be added
                if (arrayA[countA] <= arrayB[countB])
                {
                    arrayC[countC] = arrayA[countA];
                    countA++;
                }
                else
                {
                    arrayC[countC] = arrayB[countB];
                    countB++;
                }
            }
        }
    }
}
