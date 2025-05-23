package ru.proffen;

import java.util.*;
import java.util.stream.Collectors;


//Leetcode 347. Top K Frequent Elements
public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        // Считаем количество повторений
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());

        //сортировка по убыванию частоты
        entries.sort((a, b) -> b.getValue() - a.getValue());



        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = entries.get(i).getKey();
        }

        return res;
    }

    public static void main(String[] args) {

        topKFrequent(new int[]{-1, -1, 1, 2, 2, 3, 4}, 2);
    }

}
