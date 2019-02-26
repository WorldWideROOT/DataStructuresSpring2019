import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		// create an empty array list:
		ArrayList<String> strings = new ArrayList<>();

		// no elements in the array list
		System.out.println(strings.size());

		strings.add("cat");
		strings.add("dog");
		strings.add("mouse");

		// you can print array lists easily
		System.out.println(strings);

		int i = 1;
		String s = strings.get(i);
		System.out.println("The element at index " + i + " is \"" + s + "\"");

		// the array list hasn't changed
		System.out.println(strings);

		strings.remove(i);
		System.out.println(strings);

		s = strings.get(i);
		System.out.println("The element at index " + i + " is \"" + s + "\"");

		strings.add("cat");
		System.out.println(strings);

		// remove the first occurrence of "cat"
		strings.remove("cat");
		System.out.println(strings);

		strings.set(i, "cow");
		System.out.println(strings);

		// you can use a for-each loop on array lists
		for (String str : strings) {
			if (str.charAt(0) == 'c') {
				System.out.println(str);
			}
		}
	}
}
