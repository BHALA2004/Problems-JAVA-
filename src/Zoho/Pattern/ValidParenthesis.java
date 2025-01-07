package Zoho.Pattern;
import java.util.*;
public class ValidParenthesis {
        public static String removeUnbalancedParentheses(String expression) {
            Stack<Integer> stack = new Stack<>();
            Set<Integer> invalidIndices = new HashSet<>();

            // Identify unmatched parentheses
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);
                if (ch == '(') {
                    stack.push(i); // Push the index of '('
                } else if (ch == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop(); // Match with the last unmatched '('
                    } else {
                        invalidIndices.add(i); // Mark ')' as invalid
                    }
                }
            }

            // Add any unmatched '(' indices from the stack
            while (!stack.isEmpty()) {
                invalidIndices.add(stack.pop());
            }

            // Build the result string
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < expression.length(); i++) {
                if (!invalidIndices.contains(i)) {
                    result.append(expression.charAt(i));
                }
            }

            return result.toString();
        }
    public static void main(String[] args) {
        // Test cases
        System.out.println(removeUnbalancedParentheses("((abc)((de))")); // Output: ((abc)(de))
        System.out.println(removeUnbalancedParentheses("(a(b)))(cd)"));  // Output: (a(b))(cd)
        System.out.println(removeUnbalancedParentheses("(a(b)))(c(d)")); // Output: (a(b))(cd)
        System.out.println(removeUnbalancedParentheses("(ab))(c(d))))")); // Output: (ab)(c(d))
        System.out.println(removeUnbalancedParentheses("(((ab)"));        // Output: (ab)
    }
}
