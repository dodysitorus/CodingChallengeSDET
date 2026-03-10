package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountUppernLower {
    public static void main(String[] args) {
        String input = "WelcomE to thE AutomatioN";
        int countUpper = 0;
        int countLower = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                countUpper++;
            }
            if (Character.isLowerCase(input.charAt(i))) {
                countLower++;
            }
        }
        System.out.println("Count Upper: " + countUpper);
        System.out.println("Count Lower: " + countLower);

        Map<String, Integer> map = new HashMap<>();
        map.put("UPPERCASE", 0);
        map.put("LOWERCASE", 0);
        for (int j = 0; j < input.length(); j++) {
            char c = input.charAt(j);
            if (Character.isUpperCase(c)) {
                map.put("UPPERCASE", map.getOrDefault("UPPERCASE", 0) + 1);
            }
            if (Character.isLowerCase(c)) {
                map.put("LOWERCASE", map.getOrDefault("LOWERCASE", 0) + 1);
            }
        }
        System.out.println("map upper " + map.get("UPPERCASE"));
        System.out.println("map lower " + map.get("LOWERCASE"));
    }

}
