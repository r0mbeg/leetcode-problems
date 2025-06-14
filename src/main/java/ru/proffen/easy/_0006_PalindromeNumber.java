package ru.proffen.easy;

import java.util.ArrayList;
import java.util.Objects;


//LeetCode 9. Palindrome Number
public class _0006_PalindromeNumber {
    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        ArrayList<Integer> list = intToArrayList(x);

        for (int i = 0; i < list.size(); i++) {
            if (!Objects.equals(list.get(i), list.get(list.size() - 1 - i))) {
                return false;
            }
        }
        return true;
    }


    public static ArrayList<Integer> intToArrayList(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        while (x > 0) {
            list.add(x % 10);
            x /= 10;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12121));
    }

}
