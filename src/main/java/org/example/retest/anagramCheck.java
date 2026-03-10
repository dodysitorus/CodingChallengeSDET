package org.example.retest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class anagramCheck {
    public static void main(String[] args) {
        String firstInput = "listen";
        String secondInput = "silent";
        System.out.println(aNagram(firstInput, secondInput));

    }
    public static boolean aNagram(String firstInput, String secondInput){
        if (firstInput.length()!= secondInput.length()){
            return false;
        }
        char[] firstInputChar = firstInput.toCharArray();
        char[] secondInputChar = secondInput.toCharArray();

        Arrays.sort(firstInputChar);
        Arrays.sort(secondInputChar);

        return Arrays.equals(firstInputChar, secondInputChar);
    }

    public static boolean aNagramHashMap(String firstInput, String secondInput){
        if (firstInput.length()!= secondInput.length()){
            return false;
        }

        Map<Character, Integer> firstMap = new HashMap<>();

        char[] firstInputChar = firstInput.toCharArray();
        char[] secondInputChar = secondInput.toCharArray();

        for (int i = 0; i < firstInputChar.length; i++) {
            firstMap.put(firstInputChar[i], firstMap.getOrDefault(firstInputChar[i], 0) + 1);
        }

        for (int i = 0; i < secondInputChar.length; i++){
            if (!firstMap.containsKey(secondInputChar[i])){
                return false;
            }
            firstMap.put(secondInputChar[i], firstMap.get(secondInputChar[i]) -1);
        }

        return true;
    }
}
