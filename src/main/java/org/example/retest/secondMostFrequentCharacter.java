package org.example.retest;

import java.util.HashMap;
import java.util.Map;

public class secondMostFrequentCharacter {
    public static void main(String[] args) {
        String input = "aabbb";
        System.out.println(secondMostFrequentChar(input));
        System.out.println(secondMostFrequentChar("bbaaa"));
    }

    public static Character secondMostFrequentChar(String input) {
        char[] inputChar = input.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < inputChar.length; i++) {
            char currentChar = inputChar[i];
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
        }

        int maxCount = 0;
        int secondCount = 0;
        Character maxChar = null;
        Character secondmaxChar = null;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int currentCount = entry.getValue();
            char currentChar = entry.getKey();

            if (currentCount > maxCount) {
                secondCount = maxCount;
                secondmaxChar = maxChar;

                maxCount = currentCount;
                maxChar = currentChar;
            } else if (currentCount > secondCount && currentCount < maxCount) {
                secondCount = currentCount;
                secondmaxChar = currentChar;
            }
        }

        return secondmaxChar;
    }
}
