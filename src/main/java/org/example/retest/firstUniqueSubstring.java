package org.example.retest;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class firstUniqueSubstring {
    public static void main(String[] args) {

        String input = "abbacdaab";
        char[] charInput = input.toCharArray();

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < charInput.length; i++) {
            set.add(charInput[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }
        System.out.println(sb);
        System.out.println(firstUniqueSubstringSolution(input));
    }

    public static  String firstUniqueSubstringSolution(String input) {
        char[] inputChar = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : inputChar) {
            if (set.add(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
