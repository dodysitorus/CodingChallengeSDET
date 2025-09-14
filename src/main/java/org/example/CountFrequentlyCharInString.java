package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class CountFrequentlyCharInString {
    public static void main(String[] args) {

        System.out.println(countFrequentlyCharInString("madam"));
        System.out.println(countFrequentlyCharInStringMap("madam"));
    }

    public static String countFrequentlyCharInString(String input) {
        char[] stringToArray = input.toCharArray();
        Arrays.sort(stringToArray);

        int count = 1;
        for (int i = 0; i < stringToArray.length - 1; i++) {
            if (stringToArray[i] == stringToArray[i + 1]) {
                count++;
            } else {
                System.out.println(stringToArray[i] + " :" + count);
                count = 1;
            }
        }
        System.out.println(stringToArray[stringToArray.length - 1] + " :" + count);

        return new String(stringToArray);
    }

    public static HashMap<Character, Integer> countFrequentlyCharInStringMap(String input) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        char[] inputArray = input.toCharArray();
        for (char x : inputArray) {
            frequencyMap.put(x, frequencyMap.getOrDefault(x, 0) + 1);
        }
        return frequencyMap;
    }
}
