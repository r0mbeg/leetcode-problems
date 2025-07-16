package ru.proffen.medium;

import java.util.*;

public class _0046_Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return permute(list);
    }


    public static List<List<Integer>> permute(List<Integer> nums) {
        if (nums.isEmpty()) return List.of(List.of());
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            Integer current = nums.get(i);
            List<Integer> remaining = new ArrayList<>(nums);
            remaining.remove(i);
            for (List<Integer> sub : permute(remaining)) {
                List<Integer> newList = new ArrayList<>();
                newList.add(current);
                newList.addAll(sub);
                result.add(newList);
            }
        }
        return result;
    }
}
