/**
 OurList interface is modeled after the List interface in the
 Java Collections Framework. The prefix "Our" is to avoid name
 clashes with the standard Java interfaces and classes.

 Author: Elena Machkasova
 Purpose: to be used in CSci 2101 UMM course
 **/

public interface OurList<E>  {
    /**
     * @return true if this list contains no elements,
     * false otherwise
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in this list.
     * @return the number of elements in this list
     */
    public int size();

    /**
     * Inserts the specified element at the specified index in this list
     * @param index - the index where to insert the element
     * @param item - the item to be inserted
     * @throws ListIndexOutOfBoundsException - if the index is out of range (index < 0 || index > size()).
     */
    public void add(int index, E item) throws ListIndexOutOfBoundsException;

    /**
     * Returns the element at the specified position in this list.
     * @param index - the index of the element to be returned
     * @return - the element at the specified position in this list.
     * @throws ListIndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size()).
     */
    public E get(int index) throws ListIndexOutOfBoundsException;

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from their indices).
     * @param index - the index of the element to removed.
     * @throws ListIndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size()).
     */
    public void remove(int index) throws ListIndexOutOfBoundsException;

    /**
     * Removes all of the elements from this list (optional operation).
     * This list will be empty after this call returns.
     * @return
     */
    public void clear();

}

