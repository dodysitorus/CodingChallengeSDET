package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElemenArray {
    public static void main(String[] args) {
        String[] names = {"Java", "JavaScript", "Ruby", "C", "Python", "Java", "C"};
        System.out.println(findDuplicateLoop(names));
        System.out.println(findDuplicateHashSet(names));
        System.out.println(findDuplicateHashMap(names));
    }

    public static String findDuplicateLoop(String[] input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i].equals(input[j])) {
                    result.append(input[i]);
                }
            }
        }
        return new String(result);
    }

    public static String findDuplicateHashSet(String[] input) {
        StringBuilder result = new StringBuilder();

        HashSet<String> store = new HashSet<>();
        for (String name : input) {
            if (store.add(name) == false) {
                result.append(name);
            }
        }
        return new String(result);
    }

    public static String findDuplicateHashMap(String[] input) {
        StringBuilder result = new StringBuilder();

        HashMap<String, Integer> store = new HashMap<>();
        for (String name : input) {
            store.put(name, store.getOrDefault(name, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : store.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > 1) {
                result.append(key);
            }
        }
        return new String(result);
    }
}
