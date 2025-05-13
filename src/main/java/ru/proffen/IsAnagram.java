package ru.proffen;

//Leetcode 242. Valid anagram

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCountS = new HashMap<>();
        Map<Character, Integer> charCountT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            charCountS.put(s.charAt(i), charCountS.getOrDefault(s.charAt(i), 0) + 1);
            charCountT.put(t.charAt(i), charCountT.getOrDefault(t.charAt(i), 0) + 1);
        }

        return charCountS.equals(charCountT);
    }

    public static void main(String[] args) {
        System.out.print(isAnagram("anagram",
                                   "nagaram"));
    }
}
