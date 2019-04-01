import java.util.Random;

public class TestSorting {
    public static void main(String [] args) {
        // the array must be of Integer, not int,
        // otherwise it's not recognized as Comparable
        System.out.println("======== Testing random array generating ==========");
        Integer [] toSort = randomInts(1, 101, 20);
        printIntArray(toSort);
        System.out.println(SortingMethods.isSorted(toSort));

        System.out.println("======== Testing insertion sort ==========");

        // small-scale test: print elements
        toSort = randomInts(1,101, 10);
        System.out.println("Before sorting: ");
        printIntArray(toSort);
        System.out.println("After sorting: ");
        SortingMethods.insertionSort(toSort);
        printIntArray(toSort);

        // larger-scale test: run on several arrays and check if they
        // are sorted
        boolean allSorted = true;
        for (int i = 0; i < 5; ++i) {
            toSort = randomInts(1, 101, 20 * (i + 1));
            SortingMethods.insertionSort(toSort);
            boolean isSorted = SortingMethods.isSorted(toSort);
            allSorted = allSorted && isSorted;
            System.out.println("An array of " + 20 *(i + 1) + " elements is sorted: " + isSorted);
            if (!isSorted) {
                System.out.println("This array was not sorted properly:");
                printIntArray(toSort);
            }
        }
        if (allSorted) {
            System.out.println("Congratulations! Your insertion sort is working!");
        } else {
            System.out.println("There are problems with your insertion sort");
        }

        System.out.println("======== Testing merge sort ==========");

        toSort = randomInts(1,101, 11);
        System.out.println("Before sorting: ");
        printIntArray(toSort);
        System.out.println("After sorting: ");
        SortingMethods.mergeSort(toSort);
        printIntArray(toSort);

        allSorted = true;
        for (int i = 0; i < 5; ++i) {
            toSort = randomInts(1, 101, 20 * (i + 1));
            SortingMethods.mergeSort(toSort);
            boolean isSorted = SortingMethods.isSorted(toSort);
            allSorted = allSorted && isSorted;
            System.out.println("An array of " + 20 *(i + 1) + " elements is sorted: " + isSorted);
            if (!isSorted) {
                System.out.println("This array was not sorted properly:");
                printIntArray(toSort);
            }
        }

        if (allSorted) {
            System.out.println("Congratulations! Your merge sort is working!");
        } else {
            System.out.println("There are problems with your merge sort");
        }

    }

    /**
     * Generates an array of random Integers in the range from
     * min (inclusive) to max (exclusive). The number of elements
     * is given by num.
     * @param min - the minimum value (inclusive)
     * @param max - the maximum value (exclusive)
     * @param num - the number of elements in the array
     * @return - the array of num random Integers between min and max
     * @throws IllegalArgumentException if min >= max or num < 0
     */
    public static Integer [] randomInts(int min, int max, int num) {
        if (min >= max || num < 0) {
            throw new IllegalArgumentException();
        }
        Integer [] theInts = new Integer[num];
        Random rand = new Random();
        for (int i = 0; i < num; ++i){
            theInts[i] = rand.nextInt(max - min) + min;
        }
        return theInts;
    }


    /**
     *
     * The method prints its argument <code>arr</code>
     * element by element on one line, separated by commas,
     * with [ before the first element and ] after the last one
     * @param arr - an array of type Integer
     */
    public static void printIntArray(Integer [] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

}