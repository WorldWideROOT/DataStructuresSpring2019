import java.util.Stack;
import java.util.Vector;


public class VectorStackExample {
	/**
	 * This program illustrates Java inheritance using predefined 
	 * Java classes Vector and Stack. A Stack class is a subclass
	 * of Vector (another way of saying this is that a Stack class 
	 * inherits from a Vector class)
	 * 
	 * In this example:
	 * Methods of Vector that the Stack has as well, via inheritance:
	 * add, set, remove
	 * Methods of Stack class has that are not in the Vector class:
	 * push, pop
	 * 
	 * Author: Elena Machkasova
	 * Written for UMM CSci 2101 Data Structures 
	 * @param args
	 */

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(5);
		vector.add(2);
		vector.set(0, 4);
		vector.add(1, 33);
		
		System.out.println(vector);
		
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(2);
		
		System.out.println(stack);
		
		// a stack is a vector, so all vector methods can be
		// used on stacks, even though this is not the intended 
		// way of working with stacks. 
		stack.set(0, 4);
		stack.add(1, 33);
		
		System.out.println(stack);
		
		// and you can still use stack methods:
		stack.pop();
	
		// a stack is a vector, so we can assign it to a Vector variable:
		vector = stack; // vector and stack point to the same Stack object on the heap
		
		// we can use vector methods on a vector variable:
		vector.remove(0); 
		
		System.out.println(stack);
		
		// we can use stack methods via the Stack variable:
		stack.push(12);
		
		System.out.println(stack);
		
		// however, we cannot use Stack methods on the Vector variable:
		// vector.push(3); // compilation error
		
		// we can do it via typecasting:
		((Stack<Integer>) vector).push(7);
		
		System.out.println(stack);
	}

}
