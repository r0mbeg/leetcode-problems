package ru.proffen;

import java.util.Stack;


//Leetcode 20. Valid Parentheses
public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char ch;
        char top;

        if (countChar(s, '{') != countChar(s, '}')) return false;
        if (countChar(s, '(') != countChar(s, ')')) return false;
        if (countChar(s, '[') != countChar(s, ']')) return false;


        for (int i = 0; i < s.length(); i++) {

            ch = s.charAt(i);

            if (ch == '{' || ch == '(' || ch == '[') {
                stack.add(ch);
            } else {
                if (stack.isEmpty()) return false;
                top = stack.peek();
                if (ch == '}' && top == '{' ||
                        ch == ')' && top == '(' ||
                        ch == ']' && top == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static int countChar(String s, char c) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) count++;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(isValid("(())[]()"));

    }
}
