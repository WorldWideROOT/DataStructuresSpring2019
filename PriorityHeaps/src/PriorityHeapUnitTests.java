import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import org.junit.Test;

public class PriorityHeapUnitTests {
    @Test
    public void testIsEmpty() {
        OurQueue<String> queue = new OurPriorityHeap<>();
        assertTrue(queue.isEmpty());
        queue.add("apple");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testSize() {
        OurQueue<String> queue = new OurPriorityHeap<>();
        assertEquals(0, queue.size());
        queue.add("orange");
        assertEquals(1, queue.size());
        queue.add("apple");
        assertEquals(2, queue.size());
        queue.add("kiwi");
        assertEquals(3, queue.size());
    }

    @Test
    public void singleItemTest() {
        OurQueue<String> queue = new OurPriorityHeap<>();
        queue.add("kiwi");
        assertEquals("kiwi", queue.element());
        assertEquals(1, queue.size());
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testElement() {
        OurQueue<String> queue = new OurPriorityHeap<>();
        queue.add("apple");
        queue.add("banana");
        assertEquals("apple", queue.element());
        assertEquals("apple", queue.element());
    }

    @Test
    public void threeItemsTest() {
        OurQueue<String> queue = new OurPriorityHeap<>();
        queue.add("kiwi");
        queue.add("apple");
        queue.add("orange");

        assertFalse(queue.isEmpty());
        assertEquals(3, queue.size());
        assertEquals("apple", queue.element());
    }

    @Test(expected = NoSuchElementException.class)
    public void testNoSuchElementExceptionRemove() throws NoSuchElementException {
        OurQueue<String> queue = new OurPriorityHeap<>();
        queue.remove();
    }

    @Test(expected = NoSuchElementException.class)
    public void testNoSuchElementExceptionElement() throws NoSuchElementException {
        OurQueue<String> queue = new OurPriorityHeap<>();
        queue.element();
    }

    @Test
    public void testRemove() {
        OurQueue<String> queue = new OurPriorityHeap<>();
        queue.add("orange");
        queue.add("apple");
        queue.add("berry");
        queue.add("strawberry");
        assertEquals("apple", queue.remove());     //This test can check the element that I remove
        assertEquals("berry", queue.remove());             //are same and the last remove can check the
        assertEquals("orange", queue.remove());           //exception in the remove method.
        assertEquals("strawberry",queue.remove());
        assertEquals(0, queue.size());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIteratorHasAllElements() {
        OurQueue<String> queue = new OurPriorityHeap<>();
        queue.add("orange");
        queue.add("apple");
        queue.add("berry");
        queue.add("strawberry");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("apple");
        expected.add("berry");
        expected.add("orange");
        expected.add("strawberry");
        ArrayList<String> result = new ArrayList<>();
        // put all the elements into the array list
        for (String str: queue) {
            result.add(str);
        }
        // the elements might not be in the same order; sort them
        Collections.sort(result);
        assertEquals(expected, result);
    }

}
