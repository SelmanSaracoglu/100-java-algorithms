package algorithms.day004;


import java.util.Stack;

/*
Write a Java program to check whether a given string contains balanced parentheses: (), {}, and []
 -  {[()()]} → Balanced
 -  ({[)]} → Not Balanced
 */
public class A012_ParenthesesChecker {

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']' ) {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (!isMatchingPair(top,c)) return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return  (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String test = "{[())]}";
        System.out.println("Is balanced?:\n" + isBalanced(test));
    }

}
