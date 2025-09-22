package org.example;

import java.util.HashMap;

public class CountCharInString {
    public static void main(String[] args) {
        String s = "aaabbbccdeef";
        String s1 = "eaadabbfbccdeaefg";
        System.out.println(countCharInString(s));
        System.out.println(countCharInString(s1));
        //output = a3b3c2d1e2f1
    }

    public static String countCharInString(String s) {
        StringBuilder sb = new StringBuilder();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()) {
            sb.append(c).append(map.get(c));
        }

        return new String(sb);
    }
}
