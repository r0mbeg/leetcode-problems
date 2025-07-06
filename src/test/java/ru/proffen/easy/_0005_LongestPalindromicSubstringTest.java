package ru.proffen.easy;

import org.junit.jupiter.api.Test;
import ru.proffen.medium._0005_LongestPalindromicSubstring;

import static org.junit.jupiter.api.Assertions.*;

public class _0005_LongestPalindromicSubstringTest {

    @Test
    void testExampleCase1() {
        _0005_LongestPalindromicSubstring solver = new _0005_LongestPalindromicSubstring();
        String result = solver.longestPalindrome("babad");
        assertEquals("bab", result);
    }

    @Test
    void testExampleCase2() {
        _0005_LongestPalindromicSubstring solver = new _0005_LongestPalindromicSubstring();
        String result = solver.longestPalindrome("cbbd");
        assertEquals("bb", result);
    }

    @Test
    void testExampleCase3() {
        _0005_LongestPalindromicSubstring solver = new _0005_LongestPalindromicSubstring();
        String result = solver.longestPalindrome("abcba");
        assertEquals("abcba", result);
    }
}
