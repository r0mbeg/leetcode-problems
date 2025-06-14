package ru.proffen.medium;

import java.util.*;

public class _0692_TopKFrequentWords {

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> wordCount = new TreeMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        TreeMap<Integer, List<String>> treeMap = new TreeMap<>(Collections.reverseOrder());


        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            int freq = entry.getValue();
            String word = entry.getKey();
            if (!treeMap.containsKey(freq)) {
                treeMap.put(freq, new ArrayList<>());
            }
            treeMap.get(freq).add(word);
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<Integer, List<String>> entry : treeMap.entrySet()) {
            List<String> wordsAtFreq = entry.getValue();
            for (String w : wordsAtFreq) {
                result.add(w);
                if (result.size() == k) {
                    break;
                }
            }
            if (result.size() == k) {
                break;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;

        System.out.println(topKFrequent(words, k));
    }


}
