package ru.proffen;


//LeetCode 69. Sqrt(x)
public class SqrtX {

    public static int mySqrt(int x) {

        long left = 0;
        long right = x;

        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }

        return (int)result;
    }







    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

}
