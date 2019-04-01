public class SortingMethods {
    /**
     * The method sorts an array using insertion sort
     * @param <T> - the type of elements in the array (must extend Comparable<T>)
     * @param arr - the array to be sorted
     */
    // the method is static and sorts any data that implements Comparable
    // interface: String, Integer, Card (if implements Comparable<Card>
    public static <T extends Comparable<T>> void insertionSort(T [] arr) {

        for (int i = 1; i < arr.length; ++i) {
            // loop invariant: arr[0..i-1] is sorted

            // the item to be inserted into the proper
            // position in the sorted portion of the array
            T nextItem = arr[i];

            // iterating through the sorted portion backward
            int j = i;
            while (j > 0 && arr[j-1].compareTo(nextItem) > 0){
                // loop invariant: nextItem is smaller than
                // elements to the left of it

                //shift arr[j-1] to the right
                arr[j] = arr[j-1];
                j--;
            }
            // insert the new item into its position
            arr[j] = nextItem;
        }
    }

    /**
     *
     * The method takes an array and returns true if the array is in order (from lowest to highest)
     * and false otherwise. Allows repeated elements.
     * @param arr - the array to be checked
     * @param <T> - the type of elements in the array (must extend Comparable<T>)
     * @return - a boolean that indicates whether the elements of the array are in order
     */
    public static <T extends Comparable<T>> boolean isSorted(T [] arr) {
        return false;
    }

    /**
     * The method sorts an array using merge sort. The method is recursive.
     * @param <T> - the type of elements in the array (must extend Comparable<T>)
     * @param arr - the array to be sorted
     */
    public static <T extends Comparable<T>> void mergeSort(T [] arr) {
        if (arr.length > 1) {
            // split the array into two halves
            int length1 = arr.length/2;
            int length2 = arr.length - arr.length/2;

            // create the arrays:
            T[] half1 = (T[]) new Comparable[length1];
            T[] half2 = (T[]) new Comparable[length2];

            // copy the corresponding portions of the array into new arrays
            for(int i = 0; i<length1; i++) {
                half1[i] = arr[i];
            }

            for(int i = length1; i < arr.length; i++) {
                half2[i - length1] = arr[i];
            }

            // fill in the rest of your code here
        }
    }
}
