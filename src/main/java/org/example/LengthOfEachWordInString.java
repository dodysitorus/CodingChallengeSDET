package org.example;

import java.util.ArrayList;
import java.util.List;

public class LengthOfEachWordInString {
    public static void main(String[] args) {
        System.out.println(lengthOfEachWordInString("Hello World"));
        System.out.println(lengthOfEachWordInString("      Hello World      moon     "));
        System.out.println(lengthOfEachWordInString("   Hello World"));
    }

    public static List<Integer> lengthOfEachWordInString(String s) {
        String s1 = s.trim();
        char[] inputArray = s1.toCharArray();

        List<Integer> lengths = new ArrayList<>();
        int count = 0;

        for (int i = inputArray.length - 1; i >= 0; i--) {
            char charArray = inputArray[i];
            if (charArray != ' ') {
                count++;
            } else {
                if (count > 0) {
                    lengths.add(count);
                    count = 0;
                }
            }
        }

        if (count > 0){
            lengths.add(count);
        }
        return lengths;
    }
}
