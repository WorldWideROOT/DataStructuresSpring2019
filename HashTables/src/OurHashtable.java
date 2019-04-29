/**
 * Hashtable interface for CSci 2101
 * @author Elena Machkasova
 *
 * @param <K> - key type
 * @param <V> - value type
 */

public interface OurHashtable<K, V> {
    /**
     * @return true if the table is empty, false otherwise
     **/
    public boolean isEmpty();

    /**
     * @return the number of elements in the table
     **/
    public int size();
    /**
     * Adds a given value indexed with a given key to the table according to the
     * binary search structure
     *
     * @param key
     *            - the key of the given element
     * @param value
     *            - the value of the given element
     */
    public void put(K key, V value);

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
    public V get(K key);

    /**
     * Clears all elements from a given table.
     * The resulting table is empty.
     */
    public void clear();

}