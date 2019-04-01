import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class UnitTestSorting {
    @Test
    public void intertionSortTenElements() {
        String[] strings = {"orange", "kiwi", "raspberry", "cherry", "apple",
            "banana", "watermelon", "pear", "peach", "mango"};
        String[] sorted = {"apple", "banana", "cherry", "kiwi", "mango",
            "orange", "peach", "pear", "raspberry", "watermelon"};
        SortingMethods.insertionSort(strings);
        assertArrayEquals(sorted, strings);
    }

    @Test
    public void intertionSortRandomHundred() {
        Integer [] toTest = new Integer[100];
        Integer [] sorted = new Integer[100];
        // create two arrays of 100 integers from 0 to 99
        for (int i = 0; i < 100; ++i) {
            toTest[i] = i;
            sorted[i] = i;
        }
        // shuffle one of them
        Random rand = new Random();
        for (int i = 0; i < 1000; ++i ){
            int pos1 = rand.nextInt(100);
            int pos2 = rand.nextInt(100);
            Integer temp = toTest[pos1];
            toTest[pos1] = toTest[pos2];
            toTest[pos2] = temp;
        }
        // sort the array
        SortingMethods.insertionSort(toTest);
        assertArrayEquals(sorted, toTest);
    }
}
