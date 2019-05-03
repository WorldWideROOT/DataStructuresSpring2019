/**
 * A hashtable example for CSci 2101
 * @author Elena Machkasova
 *
 * @param <K> - key type
 * @param <V> - value type
 */

public class LinearProbingHashtable<K,V> extends OpenAddressHashtable<K,V> {

    @Override
    protected int getNextIndex(K key, int probeNumber) {
        // TODO Auto-generated method stub
        return 0;
    }

}