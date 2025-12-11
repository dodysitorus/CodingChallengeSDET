package org.example;

import java.util.HashMap;

public class firstUniqueChar {
    public static void main(String[] args) {
        String s = "aaabccd";
        System.out.println(firstUniqueChar(s));
    }

    public static Character firstUniqueChar(String input) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        for (char c : input.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }

        return '-';
    }

}
