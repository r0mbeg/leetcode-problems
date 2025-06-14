package ru.proffen.easy;

public class _0278_FirstBadVersion {

    public static boolean isBadVersion(int n) {
        return true;
    }

    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        int mid = (right - left) / 2;

        while (left < right) {
            mid = (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return mid;
    }


}
