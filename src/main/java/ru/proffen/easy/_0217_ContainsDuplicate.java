package ru.proffen.easy;

import java.util.HashSet;
import java.util.Set;

public class _0217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i: nums) {
            set.add(i);
        }

        return nums.length != set.size();
    }
}
