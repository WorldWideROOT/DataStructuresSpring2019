/**
 * A class for storing key-value pairs 
 * mypair.key gives the key, mypair.value gives the value
 *
 * @author Elena Machkasova
 *
 * @param <K> - key type 
 * @param <V> - value type 
 */

public class KVPair<K, V> {
    final public K key;
    final public V value;

    public KVPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public boolean equals(Object other) {
        if (! (other instanceof KVPair)) {
            return false;
        }
        KVPair<K,V> otherPair = (KVPair<K,V>) other;
        return (key.equals(otherPair.key) && value.equals(otherPair.value));
    }
}