package ru.proffen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;


//Leetcode 347. Top K Frequent Elements
public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new TreeMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        System.out.println(map);

        int[] res = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue) // превращает Stream<Integer> в IntStream
                .toArray();

        System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        topKFrequent(new int[]{-1, -1, 1, 2, 2, 3, 4}, 2);
    }

}
