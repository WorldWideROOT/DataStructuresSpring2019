import java.util.Stack;

public class ReviewStacks {
    // What will be printed by the following program? 
	// Draw memory picture for all the object variables involved.
	public static void main(String [] args){
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();	
		Stack<Integer> stack3 = stack1;

		stack1.push(1);
		stack2.push(2);
		stack3.push(3);
		stack1.push(4);
		stack2.push(5);
		stack3.push(6);

		stack1.pop();
		stack2.pop();
		
		System.out.println("stack 1 = " + stack1);
		System.out.println("stack 2 = " + stack2);
		System.out.println("stack 3 = " + stack3);	
		
		Stack<Integer> test = new Stack<>();
		test.push(1);
		test.push(2);
		test.push(3);
		
		System.out.println("Before the mystery call: " + test);
		mystery(test);
		System.out.println("After the mystery call: " + test);
		
		// Write a method that takes a stack and returns true if it has 
		// at least one element and false otherwise. The stack
		// must be the same before and after the call. 
		
		// Write and test a method that removes every other element of
		// a stack, starting at the top. For instance, if before the call
		// the stack is [1, 2, 3, 4] then after the call it is
		// [1, 3]. If the stack has only one element, it is removed. 
		// If it has no elements, it remains empty. 
	}
	
	public static void mystery(Stack<Integer> s) {
		Stack<Integer> holder = new Stack<>();
		while (!s.empty()) {
			holder.push(s.pop());
		}
		
		// what happens if the 'if' is removed and we just 
		// have holder.pop(); ? 
		if(!holder.empty()) {
			holder.pop();
		}
		
		while(!holder.empty()) {
			s.push(holder.pop());
		}
	}
}
