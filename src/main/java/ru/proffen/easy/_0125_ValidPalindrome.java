package ru.proffen.easy;

public class _0125_ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");

        int n = s.length();
        /*


        System.out.println(s + " : " + n);

        return switch (n) {
            case 0, 1 -> true;
            case 2 -> s.charAt(0) == s.charAt(1);
            case 3 -> s.charAt(0) == s.charAt(2);
            default -> s.charAt(0) == s.charAt(n - 1) && isPalindrome(s.substring(1, n - 1));
        };*/


        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}



