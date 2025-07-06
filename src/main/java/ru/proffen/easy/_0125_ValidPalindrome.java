package ru.proffen.easy;

public class _0125_ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int n = s.length();

        return switch (n) {
            case 1 -> true;
            case 2 -> s.charAt(0) == s.charAt(1);
            case 3 -> s.charAt(0) == s.charAt(2);
            default -> s.charAt(0) == s.charAt(n - 1) && isPalindrome(s.substring(1, n - 2));
        };

    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}



