package org.example;

public class LengthOfLastWordInString {
    public static void main(String[] args) {
        System.out.println(lengthLastWord("Hello World"));
        System.out.println(lengthLastWord("      Hello World      moon     "));
        System.out.println(lengthLastWord("   Hello World"));
    }

    public static int lengthLastWord(String s) {
        String s1 = s.trim();
        char[] inputArray = s1.toCharArray();
        int count = 0;
        for (int i = inputArray.length - 1; i >= 0; i--) {
            char charArray = inputArray[i];
            if (charArray != ' ') {
                count++;
            } else {
                if (count > 0) {
                    break;
                }
            }
        }
        return count;
    }
}
