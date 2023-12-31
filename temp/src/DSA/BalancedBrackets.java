package DSA;// Java program for checking
// balanced brackets
import java.util.*;

public class BalancedBrackets {

	// function to check if brackets are balanced
	static boolean areBracketsBalanced(String expr)
	{
		// Using ArrayDeque is faster than using Stack class
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i <expr.length() ; i++) {
			char ch=expr.charAt(i);

			if(ch=='{' || ch=='[' || ch=='('){
				stack.push(ch);
				continue;
			}
			if(stack.isEmpty()){
				return false;
			}
			 Character peek = stack.pop();
			switch (ch){

				case ')':
					if (peek !='(') {
						return false;
					}break;
				case '}':
					if (peek !='{') {
						return false;
					}break;
				case ']':
					if (peek !='[') {
						return false;
					}break;


			}


		}


		// Check Empty Stack
		return (stack.isEmpty());
	}

	// Driver code
	public static void main(String[] args)
	{
		String expr = "([{}])";

		// Function call
		if (areBracketsBalanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}
