package ru.proffen.easy;

public class _0374_GuessNumberHigherOfLower {

    public static int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int guess = guess(mid);

            if (guess == -1) {
                right = mid - 1;
            } else if (guess == 1) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return 1;
    }

    public static int guess(int num) {
        int pick = 1702766719;
        return Integer.compare(pick, num);

    }


    public static void main(String[] args) {
        int sas = guessNumber(2126753390);

    }
}
