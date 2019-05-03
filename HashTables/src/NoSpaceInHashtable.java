/**
 * This is an exception that is thrown when an attempt is
 * made to add an element to a hashtable, but there is no spot for it.
 * For simplicity is a RuntimeException
 */
public class NoSpaceInHashtable extends RuntimeException {
    public NoSpaceInHashtable() {
        super("Cannot add an element to a hashtable");
    }
}
