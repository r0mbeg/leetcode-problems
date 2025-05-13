package ru.proffen;
import java.math.BigInteger;


//Leetcode 8. String to Integer (atoi)
public class StringToInteger {

    public static int myAtoi(String s) {
        s = s.trim();
        s = s.replaceAll("\\D", "");

        BigInteger result = new BigInteger(s);
        return result.intValue();
    }


    public static void main(String[] args) {
        System.out.println(myAtoi("   -042"));
    }
}
