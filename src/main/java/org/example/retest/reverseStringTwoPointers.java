package org.example.retest;

public class reverseStringTwoPointers {
    public static void main(String[] args) {
        String input = "katak";

        if (input.equals(reverseString(input))){
            System.out.println(input + " is Palindrome");
        }
    }

    public static String reverseString(String input){
        char[] inputArray = input.toCharArray();

        int left = 0;
        int right = inputArray.length - 1;
        char temp;

        while (left < right){
            temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;
            left ++;
            right --;
        }
        return String.valueOf(inputArray);
    }
}
