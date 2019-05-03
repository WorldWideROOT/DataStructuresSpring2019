/**
 * Author: Elena Machkasova
 *
 * This is an example of abstract classes and static counters
 * for CSci 2101 class
 */
public abstract class Greeting {
    protected static int countFrench;
    protected static int countSpanish;

    /**
     * The method returns a translation of "hello" into a given language
     *
     * @return String "hello" in a given language
     */
    // The method is abstract: it will be implemented in subclasses
    public abstract String hello();

    /**
     * The method returns a translation of "good bye" into a given language
     *
     *  @return String "good bye" in a given language
     */
    // The method is abstract: it will be implemented in subclasses
    public abstract String goodbye();

    /**
     * Returns the length of the translation of "hello" in the given language
     * @return
     */
    // Since the method works the same in all subclasses, it's defined in
    // the abstract class itself
    public int lengthHello() {
        return hello().length();
    }

    /**
     * Returns the length of the translation of "good bye" in the given language
     * @return
     */
    // Since the method works the same in all subclasses, it's defined in
    // the abstract class itself
    public int lengthGoodbye() {
        return goodbye().length();
    }

    public static void printCounters() {
        System.out.println("There were " + countFrench + " French speakers and " +
                countSpanish + " Spanish speakers");
    }
}
