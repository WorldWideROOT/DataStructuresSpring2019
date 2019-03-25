import java.util.NoSuchElementException;


public class TestPriorityQueue {
    public static void main(String [] args) {
        OurQueue<String> queue = new OurPriorityQueue<>();
        System.out.println(queue.isEmpty()); // expect true
        System.out.println(queue.size()); // expect 0

        queue.add("kiwi");
        System.out.println(queue.isEmpty()); // expect false
        System.out.println(queue.size()); // expect 1
        System.out.println(queue.element()); // expect "kiwi"


        queue.add("apple");
        queue.add("orange");



        // expect apple, kiwi, orange
        for (String fruit: queue) {
            System.out.println(fruit);
        }

        System.out.println(queue.isEmpty()); // expect false
        System.out.println(queue.size()); // expect 3
        System.out.println(queue.element()); // expect "apple"

        System.out.println(queue.remove()); // expect "apple"
        System.out.println(queue.size()); // expect 2
        System.out.println(queue.element()); // expect "kiwi"
        System.out.println(queue.remove()); // expect "kiwi"
        System.out.println(queue.size()); // expect 1
        System.out.println(queue.remove()); // expect "orange"
        System.out.println(queue.isEmpty()); // expect true
        System.out.println(queue.size()); // expect 0

        try {
            queue.element();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

    }

}