package org.example.BelajarHashMap.soal;

import java.util.HashMap;
import java.util.Map;

public class CountString {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "apple", "orange", "banana", "apple"};
        Map<String, Integer> result = countString(fruits);

        for (Map.Entry<String, Integer> entry : result.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countString(String[] fruits) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : fruits) {
            result.put(s, result.getOrDefault(s, 0) + 1);
        }
        return result;
    }
}
