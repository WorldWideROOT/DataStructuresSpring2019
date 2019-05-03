/**
 * A hashtable example for CSci 2101
 * @author Elena Machkasova
 *
 * @param <K> - key type
 * @param <V> - value type
 */

public abstract class OpenAddressHashtable<K,V> implements OurHashtable<K,V> {
    protected int tableSize = 101;
    private int size = 0; // number of elements
    private  KVPair<K,V> [] elements;
    protected int collisionCounter = 0; // incremented every time there is a collision

    public OpenAddressHashtable() {
        elements = new KVPair[tableSize];
    }

    /**
     * @return true if the table is empty, false otherwise
     **/
    public boolean isEmpty() {
        return true;
    }

    /**
     * @return the number of elements in the table
     **/
    public int size() {
        return size;
    }
    /**
     * Adds a given value indexed with a given key to the table according to the
     * binary search structure
     *
     * @param key
     *            - the key of the given element
     * @param value
     *            - the value of the given element
     */
    public void put(K key, V value) {
        // call getNextIndex(key, 0) to get the first spot
        // if the spot is null, add the element there

        // if it's not null, increment collision counter
        // and call getNextIndex again
        // repeat until a spot is found

        // if tried for 'tableSize' times, throw a NoSpaceInHashtable exception
        // indicating that no spot is available
    }

    // implemented in subclasses, returns an index based on the key and a probe number
    abstract protected int getNextIndex(K key, int probeNumber);

    public int getCollisionCounter() {
        return collisionCounter;
    }

    /**
     * returns a value associated with the given key in this table.
     * If multiple values are associated with this key, any one may be returned.
     * If there is no element associated with this key, null is returned.
     *
     * @param key
     *            - the key to search for.
     * @return - a value to which the specified key is mapped, or null if this
     *         table contains no mapping for the key
     * @throws NullPointerException if the key is null
     */
    public V get(K key) {
        return null;
    }

    /**
     * Clears all elements from a given table.
     * The resulting table is empty.
     */
    public void clear() {

    }
}

