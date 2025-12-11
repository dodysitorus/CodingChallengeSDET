package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentInChar {
    public static void main(String[] args) {
        String s = "banana";
        System.out.println(mostFrequentInChar(s));
    }

    public static List mostFrequentInChar(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Character> result = new ArrayList<>();

        for (Character c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        int min = Integer.MAX_VALUE;
        char keyMax = '-';
        char keyMin = '-';

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                keyMax = entry.getKey();
                result.add(keyMax);
            } else if (entry.getValue() < min) {
                min = entry.getValue();
                keyMin = entry.getKey();
                result.add(keyMin);
            }
        }
        return result;
    }
}
