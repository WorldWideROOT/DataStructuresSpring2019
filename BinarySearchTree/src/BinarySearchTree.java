
/**
 * Binary search tree stores values indexed by keys. Keys must be Comparable and
 * are organized based on their natural ordering (i.e. the ordering given by
 * their compareTo). Values can be of any object type. This tree implementation
 * is not balanced, i.e. it may behave as a linked list in the worst case. Keys
 * may be repeated. Somewhat modeled after Map<K,V> classes in the Java
 * Collections Framework
 *
 * Author: Elena Machkasova For UMM CSci 2101 class.
 **/

public class BinarySearchTree<K extends Comparable<K>, V> {
    private BSTNode root = null;

    /**
     * @return true if the tree is empty, false otherwise
     **/
    public boolean isEmpty() {
        return true;
    }

    /**
     * @return the number of elements in the tree
     **/
    public int size() {
        return 0;
    }

    /**
     * Adds a given value indexed with a given key to the tree according to the
     * binary search structure
     *
     * @param key
     *            - the key of the given element
     * @param value
     *            - the value of the given element
     */
    public void put(K key, V value) {

    }

    /**
     * returns a value associated with the given key in this binary search tree.
     * If multiple values are associated with this key, any one may be returned.
     * If there is no element associated with this key, null is returned.
     *
     * @param key
     *            - the key to search for.
     * @return - a value to which the specified key is mapped, or null if this
     *         tree contains no mapping for the key
     * @throws NullPointerException if the key is null
     */
    public V get(K key) {
        return null;
    }

    /**
     * Removes an element with the given key. The resulting tree is a binary
     * search tree. If there is no such key, the tree is unchanged. If there are
     * multiple values associated with this key, only one is removed. Returns
     * the value associated with this key or null if there is no such value.
     *
     * @param key
     *            - the key
     * @return - a value to which the specified key is mapped, or null if this
     *         tree contains no mapping for the key
     * @throws NullPointerException if the key is null
     */
    public V remove(K key) {
        return null;
    }

    /**
     * Clears all elements from a given tree.
     * The resulting tree is empty.
     */
    public void clear() {

    }

    private class BSTNode {
        public K key;
        public V value;
        public BSTNode left = null;
        public BSTNode right = null;

        // null key will generate a null pointer exception when
        // a method (such as compareTo) is called on it.
        // This is fine, according to the JCF specification.
        public BSTNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }
}