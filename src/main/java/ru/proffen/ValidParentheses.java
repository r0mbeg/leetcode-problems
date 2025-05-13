package ru.proffen;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (charCount(s, '[') != charCount(s, ']')) return false;
        if (charCount(s, '{') != charCount(s, '}')) return false;
        if (charCount(s, '(') != charCount(s, ')')) return false;
        return true;
    }


    public static int charCount(String s, char c) {
        return s.length() - s.replaceAll("\\" + c, "").length();
    }

    public static void main(String[] args) {
        System.out.println(isValid("([])"));
    }
}
