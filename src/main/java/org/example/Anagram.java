package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(checkAnagramSort(s1, s2));
        System.out.println(checkAnagramHashMap(s1,s2));
    }

    public static Boolean checkAnagramSort(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1ToArr = s1.toCharArray();
        char[] s2ToArr = s2.toCharArray();

        Arrays.sort(s1ToArr);
        Arrays.sort(s2ToArr);

        return Arrays.equals(s1ToArr, s2ToArr);
    }

    public static Boolean checkAnagramHashMap(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }

            map.put(c, map.get(c) - 1);

            if (map.get(c) < 0) {
                return false;
            }
        }

        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
