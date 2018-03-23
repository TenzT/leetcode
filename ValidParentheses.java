/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 */

/*
 * Hints:Only one close close bracket is considered
 */
package Easy;

import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String s) {
		if(s.length()==1) {
			return false;
		}
		Stack<Character> strStack = new Stack<Character>();
		for(char c:s.toCharArray()) {
			if(c == '(') {
				strStack.push(')');
			} else if(c == '['){
				strStack.push(']');
			} else if(c == '{'){
				strStack.push('}');
			} else if(strStack.isEmpty() || strStack.pop() != c) {
				return false;
			}
		}
		
		return strStack.isEmpty();
	}
	
	public static void main(String[] args) {
		String str = "()";
		for(char c:str.toCharArray()) {
			System.out.println(c);
		}
		System.out.println(isValid(str));
	}
}
