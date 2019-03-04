/**
 * This simple class describes a person: their name (first, last) and date of
 * birth.
 **/
public class Person {
    // instance variables (a.k.a. fields):
    // different for each instance of a person
    // private variables are invisible outside of the
    // Person class: no other part of the program can change them
    // or even see them
    private String firstName;
    private String lastName;
    private int yearBirth; // for simplicity only have year

    // Constructor method
    // note: no return type, not even void
    /**
     * creates a person with the given first and last names and a given year of
     * birth A year that's < 0 or > 2017 causes the program to exit
     **/
    public Person(String first, String last, int year)
            throws InvalidYearException { // The method throws an invalid year exception
        firstName = first;
        lastName = last;
        // check if the year is valid, exit the program if
        // it's not. We will learn a better approach to error
        // handling later, but this will do for now
        if (year < 0 || year > 2019) {
            throw new InvalidYearException(year);
        }
        yearBirth = year;
    }

    /**
     * returns the person's first name
     **/
    public String getFirstName() {
        return firstName;
    }

    /**
     * returns the person's last name
     **/
    public String getLastName() {
        return lastName;
    }

    /**
     * returns the person's full name: concatenation of their first and last
     * name separated by a space, e.g. Robert Smith
     **/
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * the method changes the first and the last name of the person to the given
     * strings. If the new first name or the the new last name is an empty
     * string "" then the corresponding name is not changed
     **/
    public void changeName(String newFirst, String newLast) {
        if (!newFirst.equals("")) {
            firstName = newFirst;
        }
        if (!newLast.equals("")) {
            lastName = newLast;
        }
    }

    /**
     * The method takes a year and returns the age the person turns in that year
     **/
    public int age(int year) {
        return year - yearBirth;
    }
}
