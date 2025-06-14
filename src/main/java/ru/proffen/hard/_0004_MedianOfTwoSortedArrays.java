package ru.proffen.hard;

import java.util.ArrayList;
import java.util.List;


// LeetCode 4. Median of Two Sorted Arrays
public class _0004_MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;

        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] < nums2[index2]) {
                list.add(nums1[index1]);
                index1++;
            } else {
                list.add(nums2[index2]);
                index2++;
            }
        }

        while (index1 < nums1.length) {
            list.add(nums1[index1]);
            index1++;
        }

        while (index2 < nums2.length)  {
            list.add(nums2[index2]);
            index2++;
        }



        if (list.size() % 2 == 0) {
            int mid = list.size() / 2;
            return (list.get(mid - 1) + list.get(mid)) / 2.0;
        } else {
            int mid = list.size() / 2;
            return list.get(mid);
        }

    }

    public static void main(String[] args) {

        int [] nums1 = new int[]{1,6};
        int [] nums2 = new int[]{4,5};

        findMedianSortedArrays(nums1, nums2);



    }


}
