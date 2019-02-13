import java.util.Stack;
import java.util.Random;

public class ShareStacks {
	public static void main(String[] args) {
		// create a new stack of strings
		Stack<String> stack = new Stack<>();

		// push some strings onto the stack
		stack.push("apple");
		stack.push("banana");
		stack.push("kiwi");

		// Java allows you to print the entire stack
		System.out.println(stack);

		// creating a new Stack variable that points to the same stack as stack1
		Stack<String> stack1 = stack;

		// This pops the stack that both stack and stack1 point to
		stack1.pop();

		System.out.println("stack is " + stack);
		System.out.println("stack1 is " + stack1);

		// create a new (empty) stack and make stack1 hold its address
		stack1 = new Stack<>();
		m(stack1);

		// "kiwi" was pushed onto this stack when it was passed to the method m
		System.out.println("stack1 is " + stack1);

		// this makes both stack and stack1 point to the same stack
		stack = m1(stack1);

		System.out.println("stack is " + stack);
		System.out.println("stack1 is " + stack1);
	}

	public static void m(Stack<String> s) {
		s.push("kiwi");
	}

	// THis method returns the stack address
	public static Stack<String> m1(Stack<String> s) {
		s.push("lemon");
		return s;
	}
}