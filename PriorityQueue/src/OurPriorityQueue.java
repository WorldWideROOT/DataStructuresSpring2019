/**
 *
 * The class implements a min-priority queue, i.e. smaller numbers
 * have higher priority. For instance, if the queue contains
 * 2, 4, 1, then 1 is returned first, then 2, then 4.
 * The smallest element in the queue is called the head of the queue.
 * If the queue contains several elements with the same minimal value,
 * any one of them may play the role of the head.
 *
 * Elements inserted in the the queue must implement Comparable interface.
 * They are ordered based on the ordering determined by their
 * compareTo method.
 *
 * @param <E> - type of elements in the queue. Must implement Comparable<E>
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public class OurPriorityQueue<E extends Comparable<E>> implements OurQueue<E> {
    private Node first;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (first == null);
    }

    @Override
    public E element() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        return first.item;
    }

    @Override
    public void add(E item) {
        Node current = first;
        boolean running = true;

        if (current == null) {
            first = new Node(item, null);
            size = 1;
        } else {
            while (running) {
                if ((item.compareTo(current.item)) > 0) {
                    running = false;
                } else {
                    current = current.next;
                }

            }
            Node temp = current.next;
            current.next = new Node(item, temp);
            size++;
        }

    }

    @Override
    public E remove() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public Iterator<E> iterator() {
        return new PriorityQueueIterator();
    }

    private class Node {
        public E item;
        public Node next;

        public Node(E newItem, Node nextNode) {
            item = newItem;
            next = nextNode;
        }

    }

    private class PriorityQueueIterator implements Iterator<E> {

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public E next() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public void remove() {
            // TODO Auto-generated method stub

        }

    }

}
