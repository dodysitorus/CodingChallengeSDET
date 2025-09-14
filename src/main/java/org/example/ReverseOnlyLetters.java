package org.example;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("1ab3"));
    }

    public static String reverseOnlyLetters(String input) {
        char[] inputArray = input.toCharArray();
        int left = 0;
        int right = inputArray.length - 1;
        while (left < right) {
            if (!Character.isLetter(inputArray[left])) {
                left++;
            } else if (!Character.isLetter(inputArray[right])) {
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
