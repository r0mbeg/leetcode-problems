package ru.proffen.easy;

public class _0067_AddBinary {

    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;



        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += b.charAt(j--) - '0';
            }
            sb.append(carry % 2);
            carry /= 2;
        }

        return sb.reverse().toString();

    }

    public static long binToDec(long bin) {
        long res = 0;
        long num = 1;
        while (bin > 0) {
            res = res + (bin % 10) * num;
            num = num * 2;
            bin = bin / 10;
        }
        return res;
    }

    public static long decToBin(long dec) {
        long res = 0;
        long num = 1;
        while (dec > 0) {
            res = res + (dec % 2) * num;
            num = num * 10;
            dec = dec / 2;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
