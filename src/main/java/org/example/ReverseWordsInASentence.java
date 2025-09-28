package org.example;

public class ReverseWordsInASentence {
    public static void main(String[] args) {
        String s = "You are a great coder";
        System.out.println(reverseWordsInASentence(s));
        System.out.println(reverseWordsInASentenceStringBuilder(s));
    }

    public static String reverseWordsInASentence(String input) {
        StringBuilder result = new StringBuilder();

        String[] splitInput = input.split(" ");
        for (String s : splitInput) {
            StringBuilder reverseS = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                reverseS.append(s.charAt(i));
            }
            result.append(reverseS);
            result.append(" ");
        }

        return new String(result);
    }

    public static String reverseWordsInASentenceStringBuilder(String input) {
        StringBuilder result = new StringBuilder();
        String[] splitInput = input.split(" ");

        for (String s : splitInput) {
            StringBuilder reverseS = new StringBuilder(s);
            result.append(reverseS.reverse());
            result.append(" ");
        }

        return new String(result);
    }
}
