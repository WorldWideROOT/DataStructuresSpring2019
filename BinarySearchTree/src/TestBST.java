import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestBST {
    private BinarySearchTree<Integer,String> emptyTree = new BinarySearchTree<>();
    private BinarySearchTree<Integer,String> eightNodesTree= new BinarySearchTree<>();

    @Before
    public void setUp() {
        eightNodesTree.put(4,"apple");
        eightNodesTree.put(6,"banana");
        eightNodesTree.put(1,"strawberry");
        eightNodesTree.put(3,"kiwi");
        eightNodesTree.put(7,"lemon");
        eightNodesTree.put(10,"lime");
        eightNodesTree.put(6,"mango");
        eightNodesTree.put(8,"pear");
    }

    @Test
    public void TestEmpty() {
        assertTrue(emptyTree.isEmpty());
        assertEquals(0,emptyTree.size());
    }

    @Test
    public void TestNonEmpty() {
        emptyTree.put(4,"apple");
        assertFalse(emptyTree.isEmpty());
        assertEquals(1,emptyTree.size());
    }

    @Test
    public void TestPutGetRoot() {
        emptyTree.put(4,"apple");
        assertEquals("apple",emptyTree.get(4));
    }

    @Test
    public void TestGetFromEmpty() {
        assertNull(emptyTree.get(4));
    }

    @Test
    public void TestGet() {
        assertEquals("strawberry",eightNodesTree.get(1));
        assertEquals("lemon",eightNodesTree.get(7));
    }

    @Test
    public void TestGetNotThere() {
        assertNull(eightNodesTree.get(5));
    }

    @Test (expected=NullPointerException.class)
    public void TestNullKey() {
        assertNull(eightNodesTree.get(null));
    }

    @Test
    public void TestSize() {
        assertEquals(8,eightNodesTree.size());
    }

    @Test
    public void TestClear() {
        eightNodesTree.clear();
        assertTrue(eightNodesTree.isEmpty());
        assertEquals(0,eightNodesTree.size());
        assertNull(eightNodesTree.get(4));
    }

    // to-do: tests for remove, tree traversals
}