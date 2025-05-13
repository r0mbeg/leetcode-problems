package ru.proffen;

//Leetcode 1. Two Sum

public class TwoSum {

        public int[] twoSum(int[] nums, int target) {
            int[] sol = new int[2];

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length && j != i; j++) {
                    if (nums[i] + nums[j] == target) {
                        sol[0] = i;
                        sol[1] = j;
                        break;
                    }
                }
            }

            return sol;
        }

}
