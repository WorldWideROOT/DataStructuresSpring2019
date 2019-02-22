# Review questions for the first exam

## Find and correct all errors
Find and correct all errors in the follwoing
Java program. The method needs to work as described.
```java
import java.util.Stack;

public class CorrectErrors {
    // correct all mistakes in the following program:
    public static void main(String [] args) {
    	Stack<String> stack = new Stack<>();
    	stack.push(1);
    	stack.push(2);
    	stack.push(3);
    	
    	// should print true
    	System.out.println(hasNumber(stack, 2));
    	// should print the stack as it was
    	System.out.println(stack);
    	
    	// should print false
    	System.out.println(hasNumber(stack, 4));
    	// should print the stack as it was
    	System.out.println(stack);
    }
    
    /**
     * The method takes a stack and a number n
     * and returns true if the stack has n and false otherwise.
     **/
    
    public static boolean hasNumber(Stack<Integer> stack, int n) {
    	Stack<Integer> holder = new Stack<>();
    	
    	while(!holder.empty()) {
    		int top = stack.pop();
    		if (top == n) {
    			return true;
    		}
    		else {
    			top = stack.pop();
    			holder.push();
    		}
    	}
    	
    	while (holder.empty()) {
    		stack.push(holder.pop());
    	}
    	
    }
}

```

## Loops
Write a loop that, given a string, creates another
string that is the same as the previous one, but doesn't have
any vowels: a, e, o, i, u. 


## Computing Fibonacci numbers in a loop
Write a method that takes a non-negative integer n
and returns the n-th Fibonacci number.
Fibonacci numbers are defined here:
[https://en.wikipedia.org/wiki/Fibonacci_number](https://en.wikipedia.org/wiki/Fibonacci_number)

Note: do not use recursion for this problem!

## Recursion

Write a method that recursively computes the sum
of elements of a stack s. It's ok if your program
doesn't return the elements back into the stack,
but it's better if it does. 