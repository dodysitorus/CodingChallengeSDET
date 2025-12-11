package org.example.retest;

import java.util.*;

public class topKFrequentElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequentElement(nums,k)));
    }

    public static Object[] topKFrequentElement(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value >= k) {
                result.add(entry.getKey());
            }
        }
        return result.toArray();
    }
}
