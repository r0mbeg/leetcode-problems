package ru.proffen.medium;


//Leetcode 50. Pow(x, n)
public class _0050_PowXN {

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (x == 1) {
            return x;
        } else if (x == -1) {
            if (n % 2 == 0) {
                return 1;
            } else
                return -1;
        } else if (n == Integer.MIN_VALUE) {
            return 0;
        } else if (n < 0) {
            return 1 / myPow(x, -n);
        } else {
            double res = 1;
            for (int i = 0; i < n; i++) {
                res *= x;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, -2147483648));
    }
}
