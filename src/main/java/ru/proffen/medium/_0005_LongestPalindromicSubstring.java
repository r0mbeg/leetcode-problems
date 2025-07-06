package ru.proffen.medium;

public class _0005_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String longestPalindrome = String.valueOf(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j >= 0 && i < j; j--) {

                String substr = s.substring(i, j);

                if (j - i <= 1) continue;

                if (isPalindrome(substr)) {
                    if (substr.length() > longestPalindrome.length()) {
                        longestPalindrome = substr;
                    }
                }
            }
        }
        return longestPalindrome;
    }


    public static boolean isPalindrome(String s) {
        int n = s.length();

        return switch (n) {
            case 1 -> true;
            case 2 -> s.charAt(0) == s.charAt(1);
            case 3 -> s.charAt(0) == s.charAt(2);
            default -> s.charAt(0) == s.charAt(n - 1) && isPalindrome(s.substring(1, n - 1));
        };

    }
}
