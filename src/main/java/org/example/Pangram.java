package org.example;

import java.util.HashSet;

public class Pangram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        String input2 = "abcdefhijklmnopqrstuvwxyz";
        System.out.println(Pangram(input));
        System.out.println(Pangram(input2));
        System.out.println(pangramSet(input));
        System.out.println(pangramSet(input2));
    }

    public static Boolean Pangram(String input) {
        input = input.toLowerCase();
        if (input.length() < 26) {
            return false;
        }
        for (char i = 'a'; i <= 'z'; i++) {
            if (input.indexOf(i) == -1) {
                return false;
            }
        }
        return true;
    }

    public static Boolean pangramSet(String input) {
        char[] inputChar = input.toLowerCase().toCharArray();
        HashSet<Character> charSet = new HashSet<>();
        for (char c : inputChar) {
            if (Character.isLetter(c)) {
                charSet.add(c);
            }
        }
        if (charSet.size() == 26) {
            return true;
        }
        return false;
    }
}
