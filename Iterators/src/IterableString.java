/**
 * This is an artificial example of creating an iterable string. 
A string that can be iterated character by character
in a for-each loop
**/

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterableString implements Iterable<Character> {
	private String thestring;

	/**
	 * Creates a new IterableString
	 * 
	 * @param string
	 *            -- the string data
	 **/
	public IterableString(String string) {
		thestring = string;
	}

	/**
	 * Returns an iterator for the string that iterates character by character
	 **/
	public Iterator<Character> iterator() {
		return new StringIterator();
	}

	// the iterator is a private inner class
	private class StringIterator implements Iterator<Character> {
		private int position = 0;

		/**
		 * @return - true if there are more characters in the string, false
		 *         otherwise
		 **/
		public boolean hasNext() {
			return position < thestring.length();
		}

		/**
		 * @return - the next characters in the string
		 * @throws NoSuchElementException
		 *             when past the last character
		 **/
		public Character next() {
			if (position < thestring.length()) {
				Character current = thestring.charAt(position);
				++position;
				return current;
			} else {
				throw new NoSuchElementException();
			}
		}

		/**
		 * method not supported
		 **/
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
