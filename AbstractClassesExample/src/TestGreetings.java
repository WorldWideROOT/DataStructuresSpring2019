import java.util.Random;

public class TestGreetings {
    public static void main(String [] args) {
        Greeting [] conversations = new Greeting[5];

        Random r = new Random();

        for (int i = 0; i < conversations.length; ++i) {
            if (r.nextInt(2) == 0) {
                conversations[i] = new French();
            } else {
                conversations[i] = new Spanish();
            }
        }

        for (int i = 0; i < conversations.length; ++i) {
            System.out.println(conversations[i].hello() +
                    "! It's great to see you! " +
                    conversations[i].goodbye() + "!");
        }

        Greeting.printCounters();

        // Print the lengths of the greetings for each element
        // of the array
        for (int i = 0; i < conversations.length; ++i) {
            System.out.println("The length of \"hello\" is " + conversations[i].lengthHello() +
                    " and the length of \"good bye \" is "  + conversations[i].lengthGoodbye());
        }

    }
}
