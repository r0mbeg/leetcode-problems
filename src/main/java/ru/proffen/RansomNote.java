package ru.proffen;

import java.util.Arrays;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i=0; i<ransomNote.length(); i++) {
            if (charsCount(ransomNote, ransomNote.charAt(i)) > charsCount(magazine, ransomNote.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int charsCount(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

}

