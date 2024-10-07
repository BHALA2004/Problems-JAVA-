package com.zohoPDF;

import java.util.Stack;

public class RemoveUnbalancedParentheses {

    public static String removeUnbalancedParentheses(String
            expression) {
        Stack<Integer> stack = new Stack<>();

        // Find the indices of unbalanced parentheses
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    // Unbalanced closing parenthesis
                    stack.push(i);
                } else {
                    stack.pop();
                }
            }
        }

        // Remove unbalanced parentheses
        StringBuilder result = new StringBuilder();
        int lastIndex = 0;
        for (int index : stack) {
            result.append(expression.substring(lastIndex, index));
            lastIndex = index + 1;
        }
        result.append(expression.substring(lastIndex));

        return result.toString();
    }

    public static void main(String[] args) {
        String[] expressions = {
                "((abc)((de))",
                "(a(b)))(cd)",
                "(a(b)))(c(d))",
                "(ab))(c(d))))",
                "(((ab)"
        };

        for (String expression : expressions) {
            System.out.println("Input: " + expression);
            System.out.println("Output: " + removeUnbalancedParentheses(expression));
        }
    }
}