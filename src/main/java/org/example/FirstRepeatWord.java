package org.example;

import java.util.HashSet;

public class FirstRepeatWord {
    public static void main(String[] args) {
        String s = "I love java and i love coding";
        System.out.println(firstRepeatWord(s));
    }

    public static String firstRepeatWord(String s){
        String[] inputArray = s.split(" ");

        HashSet<String> set = new HashSet<>();

        for (String s1 : inputArray){
            if (set.add(s1) == false){
                return s1;
            }
        }
        return " ";
    }
}
