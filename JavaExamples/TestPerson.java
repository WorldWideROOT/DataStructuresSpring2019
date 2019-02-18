public class TestPerson {
	public static void main(String[] args) {
		// create a new Person
		Person bob = new Person("Robert", "Smith", 1985);
		// create another person
		Person mary = new Person("Mary", "Green", 1987);

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
		System.out.println("In the year " + year + " " + bob.getFullName() + " turned or will turn " + bob.age(year));
		year = 2017;
		// expected: 30
		System.out.println("In the year " + year + " " + mary.getFullName() + " turned or will turn " + mary.age(year));

		// write and test a method "isOlder"

		// write toString method so that a Person object
		// can be printed directly with System.out.println
	}
}