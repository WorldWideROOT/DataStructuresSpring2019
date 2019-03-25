import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import org.junit.Test;

public class UnitTests {
    @Test
    public void testIsEmpty() {
        OurQueue<String> queue = new OurPriorityQueue<>();
        assertTrue(queue.isEmpty());
        queue.add("food");
        assertFalse(queue.isEmpty());

    }

    @Test
    public void testSize() {
        OurQueue<String> queue = new OurPriorityQueue<>();
        assertEquals(0, queue.size());
        queue.add("food");
        assertEquals(1, queue.size());
        queue.add("apple");
        assertEquals(2, queue.size());
        queue.add("spork");
        assertEquals(3, queue.size());
    }

    @Test
    public void singleItemTest() {
        OurQueue<String> queue = new OurPriorityQueue<>();
        queue.add("kiwi");
        assertEquals("kiwi", queue.element());
        assertEquals(1, queue.size());
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testElement() {
        OurQueue<String> queue = new OurPriorityQueue<>();
        queue.add("apple");
        queue.add("banana");
        assertEquals("apple", queue.element());
        assertEquals("apple", queue.element());
    }

    @Test
    public void threeItemsTest() {
        OurQueue<String> queue = new OurPriorityQueue<>();
        queue.add("kiwi");
        queue.add("apple");
        queue.add("orange");

        assertFalse(queue.isEmpty());
        assertEquals(3, queue.size());
        assertEquals("apple", queue.element());
    }

    @Test(expected = NoSuchElementException.class)
    public void testNoSuchElementException() throws NoSuchElementException {
        OurQueue<String> queue = new OurPriorityQueue<>();
        queue.remove();
    }

}