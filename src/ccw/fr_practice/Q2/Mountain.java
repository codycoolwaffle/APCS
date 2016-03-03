package ccw.fr_practice.Q2;


/*********************************************************
 https://github.com/codycoolwaffle/APCS/tree/master/src/ccw
 *********************************************************/




public class Mountain
{
    /**
     * @param array: an array of positive integer values
     * @param stop:  the last index to check
     *               Precondition: 0 <= stop < array.length
     * @return true if for each j such that 0 <= j < stop, array[j] < array[j + 1] ;
     * false otherwise
     */
    public static boolean isIncreasing(int[] array, int stop)
    {
        for (int j = 0; j < stop - 1; j++) {
            if (array[j] >= array[j + 1])
                return false;
        }

        return true;
    }

    /**
     * @param array: an array of positive integer values
     * @param start: the first index to check
     *               Precondition: 0 <= start < array.length - 1
     * @return true if for each j such that start <= j < array.length - 1,
     * array[j] > array [j + 1];
     * false otherwise
     */
    public static boolean isDecreasing(int[] array, int start)
    {
        for (int j = start; j < array.length - 2; j++) {
            if (array[j] <= array[j + 1])
                return false;
        }

        return true;
    }

    /**
     * @param array: an array of positive integer values
     *               Precondition: array.length > 0
     * @return the index of the first peak (local maximum) in the array, if it exists;
     * -1 otherwise
     */
    public static int getPeakIndex(int[] array)
    { /* to be implemented in part (a) */

        for(int i = 1; i < array.length - 1; i++)
            if (array[i - 1] < array[i] && array[i] > array[i+1])
                return i;
        return -1;

    }

    /**
     * @param array: an array of positive integer values
     *               Precondition: array.length > 0
     * @return true if array contains values ordered as a mountain;
     * false otherwise
     */
    public static boolean isMountain(int[] array)
    { /* to be implemented in part (b) */

        int peak = getPeakIndex(array);

        return (peak != -1) && isIncreasing(array, peak) && isDecreasing(array, peak);
    }

    public static void main(String[] args)
    {
        int[] array1 = {1, 2, 3, 2, 1};
        int[] array2 = {1, 2, 1, 2, 1};
        int[] array3 = {1, 2, 3, 5, 7};
        int[] array4 = {9, 3, 5, 7, 12};
        int[] array5 = {9, 3, 5, 7, 5};
        int[] array6 = {1, 2, 3};

        System.out.println("1: " + getPeakIndex(array1) + " " + isMountain(array1));
        System.out.println("part2: " + getPeakIndex(array2) + " " + isMountain(array2));
        System.out.println("3: " + getPeakIndex(array3) + " " + isMountain(array3));
        System.out.println("4: " + getPeakIndex(array4) + " " + isMountain(array4));
        System.out.println("5: " + getPeakIndex(array5) + " " + isMountain(array5));
        System.out.println("6: " + getPeakIndex(array6) + " " + isMountain(array6));
    }

}