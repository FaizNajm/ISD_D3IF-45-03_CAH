package com.soal1;

import java.util.Scanner;
import java.util.Stack;

class Main {
    // Driver method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String infix = input.next();
        System.out.println(infixToPostfix(infix));
    }
    /**
     * The method that return
     * number based on character precedence.
     *
     * @param character the element to add
     * @return int based on precedence
     */
    static int precedence(char character) {
        switch (character) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
/**
 * The main method that converts
 * given infix expression
 * to postfix expression.
 *
 * @param infix the element to add
 */
    static String infixToPostfix(String infix) {
        // inisialisasi String kosong untuk hasil
        String hasil = new String("");

        // initializing empty stack
        Stack<Character> stackForOperator = new Stack<>();

        for (int i = 0; i<infix.length(); ++i) {
            char character = infix.charAt(i);

            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(character))
                hasil += character;

                // If the scanned character is an '(',
                // push it to the stack.
            else if (character == '(')
                stackForOperator.push(character);

                //  If the scanned character is an ')',
                // pop and output from the stack
                // until an '(' is encountered.
            else if (character == ')') {
                while (!stackForOperator.isEmpty() &&
                        stackForOperator.peek() != '(')
                    hasil += stackForOperator.pop();
                stackForOperator.pop();
            }
            // an operator is encountered
            else {
                while (!stackForOperator.isEmpty() && precedence(character)
                        <= precedence(stackForOperator.peek())){

                    hasil += stackForOperator.pop();
                }
                stackForOperator.push(character);
            }
        }

        // pop all the operators from the stack
        while (!stackForOperator.isEmpty()){
            if(stackForOperator.peek() == '(')
                return "Invalid Expression";
            hasil += stackForOperator.pop();
        }
        return hasil;
    }


}