package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {2, 4, 5, 11};
        int target = 9;
        System.out.println(Arrays.toString(twoSumLooping(nums, target)));
        System.out.println(Arrays.toString(twoSumHashMap(nums, target)));
    }

    public static int[] twoSumLooping(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int count = numbers[i] + numbers[j];
                if (count == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSumHashMap(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int extra = target - numbers[i];
            if (map.containsKey(extra)) {
                return new int[]{map.get(extra), i};
            }
            map.put(numbers[i], i);
        }
        return new int[]{};
    }

}
