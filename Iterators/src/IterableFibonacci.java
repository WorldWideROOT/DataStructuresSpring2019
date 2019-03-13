
/**
 The class implements Iterable Fibonacci numbers, i.e. 
 Fibonacci numbers that can be produced in a for-each
 (enhanced for) loop. 

 Fibonacci numbers are a sequence of numbers defined as 
 follows:
 F(0) = 0, F(1) = 1, F(k) = F(k-1) + F(k -2) for k > 1.

 For more on Fibonacci numbers see
 http://en.wikipedia.org/wiki/Fibonacci_number

 The parameter maxIndex in the constructor sets the 
 last index in the sequence. It can be reset using
 setMaxIndex method. 
 **/

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterableFibonacci implements Iterable<Integer> {
	private int maxIndex;

	/**
	 * Creates a new IterableFibonacci
	 * 
	 * @param maxIndex
	 *            -- the index of the last Fibonacci number returned in this
	 *            sequence
	 * @throws IllegalArgumentException
	 *             if maxIndex < 0
	 **/
	public IterableFibonacci(int maxIndex) {
		if (maxIndex < 0) {
			throw new IllegalArgumentException("Invalid index for Fibonacci"
					+ "sequence: " + maxIndex);
		}
		this.maxIndex = maxIndex;
	}

	/**
	 * sets the maximal index in this Fibonacci sequence
	 * 
	 * @param newMax
	 *            -- the new value of the maximum index in this sequence
	 * @throws IllegalArgumentException
	 *             if newMax < 0
	 **/
	public void setMaxIndex(int newMax) {
		if (newMax < 0) {
			throw new IllegalArgumentException("Invalid index for Fibonacci"
					+ "sequence: " + newMax);
		}
		maxIndex = newMax;
	}

	/**
	 * Returns an iterator that produces the sequence of Fibonacci numbers from
	 * index 0 to the maximum index (inclusive)
	 **/
	public Iterator<Integer> iterator() {
		return new FibonacciIterator();
	}

	private class FibonacciIterator implements Iterator<Integer> {
		// two latest Fibonacci numbers:
		private int fib1 = 0;
		private int fib2 = 1;

		/**
		 * @return - true if there are more elements in the sequence, false
		 *         otherwise
		 **/
		public boolean hasNext() {
			return false; // this is just a stub, replace with your code
		}

		/**
		 * @return - the next Fibonacci number in the sequence
		 * @throws -- FILL THIS IN
		 **/
		public Integer next() {
			return 0; // this is just a stub, replace with your code
		}

		/**
		 * method not supported
		 **/
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}