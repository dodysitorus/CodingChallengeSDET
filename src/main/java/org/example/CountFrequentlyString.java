package org.example;

import java.util.HashMap;

public class CountFrequentlyString {
    public static void main(String[] args) {
        System.out.println(countFrequentlyString("Hello Hello Bandung"));

    }

    public static HashMap<String, Integer> countFrequentlyString(String input) {
        HashMap<String, Integer> result = new HashMap<>();
        String[] inputArray = input.split(" ");

        for (String c : inputArray) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }

        return result;
    }
}
