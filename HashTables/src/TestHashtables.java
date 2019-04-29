import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class TestHashtables {
    OurHashtable<Integer, String> emptyTable = new HashtableSeparateChaining<Integer, String>();
    OurHashtable<Integer, String> fourElementTable = new HashtableSeparateChaining<Integer, String>();
    OurHashtable<Integer, String> repeatedKeysTable= new HashtableSeparateChaining<Integer, String>();


    @Before
    public void setUp() {
        // setting up fourElement table, no repeats
        fourElementTable.put(4,"apple");
        fourElementTable.put(6,"banana");
        fourElementTable.put(1,"strawberry");
        fourElementTable.put(3,"kiwi");

        // setting up repeatedKeysTable, assuming 20 buckets
        repeatedKeysTable.put(4,"apple");
        repeatedKeysTable.put(3,"banana");
        repeatedKeysTable.put(44,"strawberry");
        repeatedKeysTable.put(23,"kiwi");
    }

    @Test
    public void TestEmpty() {
        assertTrue(emptyTable.isEmpty());
        assertEquals(0,emptyTable.size());
    }

    @Test
    public void TestNonEmpty() {
        emptyTable.put(4,"apple");
        assertFalse(emptyTable.isEmpty());
        assertEquals(1,emptyTable.size());
    }

    @Test
    public void TestPutGetOneElement() {
        emptyTable.put(4,"apple");
        assertEquals("apple",emptyTable.get(4));
    }

    @Test
    public void TestGetFromEmpty() {
        assertNull(emptyTable.get(4));
    }

    @Test
    public void TestGet() {
        assertEquals("strawberry",fourElementTable.get(1));
        assertEquals("banana",fourElementTable.get(6));
    }

    @Test
    public void TestGetRepeated() {
        assertEquals("apple",repeatedKeysTable.get(4));
        assertEquals("banana",repeatedKeysTable.get(3));
        assertEquals("strawberry",repeatedKeysTable.get(44));
        assertEquals("kiwi",repeatedKeysTable.get(23));
    }

    @Test
    public void TestGetNotThere() {
        assertNull(fourElementTable.get(5));
    }

    @Test (expected=NullPointerException.class)
    public void TestNullKey() {
        assertNull(fourElementTable.get(null));
    }

    @Test
    public void TestSize() {
        assertEquals(4,fourElementTable.size());
        assertEquals(4,repeatedKeysTable.size());
    }

    @Test
    public void TestClear() {
        fourElementTable.clear();
        assertTrue(fourElementTable.isEmpty());
        assertEquals(0,fourElementTable.size());
        assertNull(fourElementTable.get(4));
    }

    @Test
    public void TestClearRepeated() {
        repeatedKeysTable.clear();
        assertTrue(repeatedKeysTable.isEmpty());
        assertEquals(0,repeatedKeysTable.size());
        assertNull(repeatedKeysTable.get(4));
    }
}
