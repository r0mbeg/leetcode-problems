package ru.proffen;


//LeetCode 9. Roman to Integer
public class RomanToInteger {

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (romanCharToInt(s.charAt(i)) < romanCharToInt(s.charAt(i + 1))) {
                result -= romanCharToInt(s.charAt(i));
            } else {
                result += romanCharToInt(s.charAt(i));
            }
        }
        result += romanCharToInt(s.charAt(s.length() - 1));
        return result;
    }


    public static int romanCharToInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }


}
