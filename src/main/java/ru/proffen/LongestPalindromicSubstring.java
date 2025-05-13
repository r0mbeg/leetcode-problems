package ru.proffen;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        if (s.length() <= 1){
            return s;
        }

        int maxLen = 1;
        String mapPal = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen; j <= s.length(); j++) {
                if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
                    maxLen = j - i;
                    mapPal = s.substring(i, j);
                }
            }
        }

        return mapPal;
    }



    public boolean isPalindrome(String s) {
        int n = s.length();

        return switch (n) {
            case 1 -> true;
            case 2 -> s.charAt(0) == s.charAt(1);
            case 3 -> s.charAt(0) == s.charAt(2);
            default -> s.charAt(0) == s.charAt(n - 1) && isPalindrome(s.substring(1, n - 2));
        };

    }

}
