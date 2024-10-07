package com.zoho;

import java.util.Stack;

public class OperatorPrecedence {
    public static void main(String[] args) {
        String expression = "2 + 3 * 4 - 5 / 6"; // Replace with your desired expression

        Stack<Character> operatorStack = new Stack<>();
        Stack<Integer> operandStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                // Build a number from consecutive digits
                StringBuilder number = new StringBuilder();
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    number.append(expression.charAt(i));

                    i++;
                }
                i--; // Adjust for the extra increment
                operandStack.push(Integer.parseInt(number.toString()));
            } else if (isOperator(ch)) {
                // Handle operators based on precedence
                while (!operatorStack.isEmpty() && precedence(ch) <= precedence(operatorStack.peek())) {
                    char op = operatorStack.pop();
                    int op2 = operandStack.pop();
                    int op1 = operandStack.pop();
                    operandStack.push(applyOperation(op, op1, op2));
                }
                operatorStack.push(ch);
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    char op = operatorStack.pop();
                    int op2 = operandStack.pop();
                    int op1 = operandStack.pop();
                    operandStack.push(applyOperation(op, op1, op2));
                }
                operatorStack.pop(); // Remove the opening parenthesis
            }
        }

        // Evaluate any remaining operators
        while (!operatorStack.isEmpty()) {
            char op = operatorStack.pop();
            int op2 = operandStack.pop();
            int op1 = operandStack.pop();
            operandStack.push(applyOperation(op, op1, op2));
        }

        // The final result is on the operand stack
        int result = operandStack.pop();
        System.out.println("Result: " + result);
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        }
        return -1; // For parentheses
    }

    private static int applyOperation(char op, int op1, int op2) {
        switch (op) {
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '*':
                return op1 * op2;
            case '/':
                return op1 / op2;
            default:
                return 0;
        }
    }
}