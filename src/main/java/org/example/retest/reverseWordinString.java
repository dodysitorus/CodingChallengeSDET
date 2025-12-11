package org.example.retest;

public class reverseWordinString {
    public static void main(String[] args) {
        String inputString = "Automation testing is fun";
        System.out.println(reverseWordInString(inputString));
    }

    public static String reverseWordInString(String input) {
        String[] inputArray = input.split(" ");
        int left = 0;
        int right = inputArray.length - 1;
        while (left < right) {
            String temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;

            left++;
            right--;
        }
        return String.join(" ", inputArray);
    }
}
