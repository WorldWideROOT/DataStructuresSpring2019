import java.util.Stack;
import java.util.Random;

public class TestStack {
	public static void main(String [] args){
		// create a new stack of strings
		
		// Before Java 7 you needed:
		//Stack<String> stack = new Stack<String>();
		
		// Since Java 7 you can skip the type in the constructor
		// if it's the same as in the variable declaration:  
		Stack<String> stack = new Stack<>();
		
		// push some strings onto the stack
		stack.push("apple");
		stack.push("banana");
		stack.push("kiwi");
		
		// Java allows you to print the entire stack
		System.out.println(stack);
		
		// pop the stack until it becomes empty
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		// create a new stack of integers
		Stack<Integer> stackInt = new Stack<>();
		stackInt.push(1);
		
		// peek at the top element, but keep it on the stack
		System.out.println(stackInt.peek());
		
		// the stack is not empty
		System.out.println(stackInt.empty());
		
		// empty the stack 
		stackInt.pop();
		
		// write a loop to store 100 random elements on the stack
		// the random elements are between 1 and 10 inclusive

		// write a method to remove all elements from the stack that 
		// are > 5. Do not change the order of the remaining elements. 
		
	}
}
