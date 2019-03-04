/**
 The class tests methods of a linked list OurLinkedList via its
 interface OurList
 **/

public class TestOurLinkedList {
    public static void main(String [] args) throws ListIndexOutOfBoundsException {
        OurList<String> strings = new OurLinkedList<String>();

        // the list should be empty initially
        System.out.println("A newly-created list:");
        // expected: true
        System.out.println("List isEmpty is " + strings.isEmpty());
        //expected: The size of the list is 0
        System.out.println("The size of the list is " + strings.size());

        strings.add(0,"hello");

        // the list after adding an element
        System.out.println("A list with one element:");
        // expected: false
        System.out.println("List isEmpty is "+ strings.isEmpty());
        //expected: The size of the list is 1
        System.out.println("The size of the list is " + strings.size());

        strings.add(1,"bye");
        strings.add(2,"greetings!");

        // the list after adding 3 elements
        System.out.println("A list with three elements:");
        // expected: false
        System.out.println("List isEmpty is "+ strings.isEmpty());
        //expected: The size of the list is 3
        System.out.println("The size of the list is " + strings.size());

        // testing add and get methods
        System.out.println("After adding three strings the list is");
        for(int i = 0; i < strings.size(); ++i) {
            String s = strings.get(i);
            System.out.println(s);
        }


        // test exception
        try {
            strings.get(55);
        } catch (ListIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        //much more testing is needed!
    }
}
