package ru.proffen.easy;

public class _0125_ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        s = s.toLowerCase();
        s = s.replaceAll("[^\\p{L}\\p{N}]", "");


        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }

        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}



