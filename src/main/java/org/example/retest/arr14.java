package org.example.retest;

import java.util.HashMap;
import java.util.Map;

public class arr14 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 4};
        int[] arr1 = {1, 1, 4};
        int[] arr2 = {1, 1};
        int[] arr3 = {4, 4};
        System.out.println(onefour(arr));
        System.out.println(onefour(arr1));
        System.out.println(onefour(arr2));
        System.out.println(onefour(arr3));
    }

    public static boolean onefour(int[] inputArr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inputArr.length; i++) {
            map.put(inputArr[i], map.getOrDefault(inputArr[i], 0) + 1);
        }

        int count_1 = 0;
        int count_2 = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == 1) {
                count_1 = entry.getValue();
            }
            if (entry.getKey() == 4) {
                count_2 = entry.getValue();
            }
        }

        return count_1 > count_2;
    }
}
