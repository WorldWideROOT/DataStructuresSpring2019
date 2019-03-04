public class TestPersonCatchException {
    public static void main(String[] args) {
        // Need to declare the variables outside of try/catch
        // block so that they can be accessible outside of the
        // block. Need to set them to something, otherwise
        // the compiler complains that they may not have been initialized.
        // The only thing we can set them to (without calling a constructor)
        // is null.
        Person bob = null;
        Person mary = null;
        Person joe = null;
        try {
            // create a new Person
            bob = new Person("Robert","Smith",1985);
            // create another person
            mary = new Person("Mary","Green", 1987);
            joe = new Person("Joe", "Future", 2020);
        } catch (InvalidYearException e) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("You entered invalid year for at least one person");
            System.out.println(e.getMessage());
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

        System.out.println("Testing names:");

        // expect to print: Robert
        System.out.println(bob.getFirstName());
        // expect to print: Green
        System.out.println(mary.getLastName());
        // expect to print: Mary Green
        System.out.println(mary.getFullName());

        System.out.println("Changing name:");
        bob.changeName("Bob", "");
        // expect: Bob Smith
        System.out.println(bob.getFullName());

        System.out.println("Checking the age:");
        int year = 2016;
        // expected: 31
        System.out.println("In the year " + year + " " + bob.getFullName()
                + " turned or will turn " + bob.age(year));
        year = 2017;
        // expected: 30
        System.out.println("In the year " + year + " " + mary.getFullName()
                + " turned or will turn " + mary.age(year));
    }
}

