package org.example;

public class ReverseOnlyVowels {
    public static void main(String[] args) {

        System.out.println(reverseOnlyVowels("hello"));

    }

    public static String reverseOnlyVowels(String input) {
        char[] inputArray = input.toCharArray();
        String vowels = "aiueoAIUEO";
        int left = 0;
        int right = inputArray.length - 1;

        while (left < right) {
            if (vowels.indexOf(inputArray[left]) == -1) {
                left++;
            } else if (vowels.indexOf(inputArray[right]) == -1) {
                right--;
            } else {
                char temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++;
                right--;
            }
        }
        return new String(inputArray);
    }
}
