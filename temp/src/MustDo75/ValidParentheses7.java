package MustDo75;

import java.util.Stack;

public class ValidParentheses7 {
    public static void main(String[] args) {
        String expr = "([{}])";
        boolean valid = isValid(expr);

        String result= valid? "VALID":"INVALID";
        System.out.println(result);

    }
    private static boolean isValid(String expression) {
        char[] charArray = expression.toCharArray();
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < charArray.length; i++) {

            char ch = charArray[i];
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            Character peek = stack.pop();

            switch (ch) {
                case ')' -> {
                    if (peek != '(') {
                        return false;
                    }
                }
                case '}' -> {
                    if (peek != '{') {
                        return false;
                    }
                }
                case ']' -> {
                    if (peek != '[') {
                        return false;
                    }
                }
            }



        }

        return stack.isEmpty();
    }
}
