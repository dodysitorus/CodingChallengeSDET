package org.example;

public class ReverseOnlyVowelsWithX {

    public static void main(String[] args) {
        System.out.println(reverseOnlyVowelsWithX("name"));
        System.out.println(reverseOnlyVowelsWithXUsingForLoop("name"));
    }

    //two pointer
    public static String reverseOnlyVowelsWithX(String input) {
        char[] inputChar = input.toCharArray();
        int left = 0;
        int right = inputChar.length - 1;
        String vowels = "aiueoAIUEO";
        char x = 'x';

        while (left < right) {
            if (vowels.indexOf(inputChar[left]) == -1) {
                left++;
            } else if (vowels.indexOf(inputChar[right]) == -1) {
                right--;
            } else {
                inputChar[left] = x;
                inputChar[right] = x;
                left++;
                right--;
            }
        }

        return new String(inputChar);
    }

    //looping
    public static String reverseOnlyVowelsWithXUsingForLoop(String input) {
        char[] inputChar = input.toCharArray();
        String vowels = "aiueoAIUEO";
        for (int i = 0; i < inputChar.length; i++) {
            if (vowels.indexOf(inputChar[i]) != -1) {
                inputChar[i] = 'x';
            }
        }
        return new String(inputChar);
    }

}
