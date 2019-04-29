import java.util.ArrayList;


public class HashtableSeparateChaining<K, V> implements OurHashtable<K,V> {
    private int numberBuckets; // the number of "buckets", default 20
    private int size = 0; // number of elements
    private ArrayList<KVPair<K,V>> [] buckets;

    // default number of buckets is 20
    public HashtableSeparateChaining() {
        this.numberBuckets = 20;
        setup();
    }

    public HashtableSeparateChaining(int numberBuckets) {
        this.numberBuckets = numberBuckets;
        setup();
    }

    /**
     * sets up initial empty arraylists based on the number of "buckets"
     */
    private void setup() {
        buckets = new ArrayList[numberBuckets]; // must create an array
        // of a "raw" type
        for (int i = 0; i < numberBuckets; ++i) {
            buckets[i] = new ArrayList<>();
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < numberBuckets; ++i) {
            buckets[i] = new ArrayList<>();
        }
    }

    @Override
    public V get(K key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public void put(K key, V value) {
        // TODO Auto-generated method stub

    }

    @Override
    public int size() {
        return size;
    }

}