package ru.proffen.easy;

public class _0409_LongestPalindrome {
    public static int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int length = 0;
        boolean hasOdd = false;
        for (int freq: count) {
            length = length + (freq / 2) * 2;
            if (freq % 2 == 1) {
                hasOdd = true;
            }
        }
        if (hasOdd) {
            length++;
        }
        return length;
    }
}
