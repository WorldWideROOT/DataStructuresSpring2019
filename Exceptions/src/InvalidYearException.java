/**
 * An example of a user-defined exception class.
 */

//  Exceptions are objects, they extend a standard java class Exception.
public class InvalidYearException extends Exception {
    public InvalidYearException(int year) {
        // a call to the constructor of the superclass Exception
        super("Year " + year + " is outside of valid range [0, 2011]");
    }
}
