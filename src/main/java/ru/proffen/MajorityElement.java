package ru.proffen;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 1;
        for (int i: nums){
            if (majority == i) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majority = i;
                    count = 1;
                }
            }
        }
        return majority;
    }

    public int countNum(int[] nums, int number){
        int count = 0;
        for (int i: nums) {
            if (i == number) {
                count++;
            }
        }
        return count;
    }
}
