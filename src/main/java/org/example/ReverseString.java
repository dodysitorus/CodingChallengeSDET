package org.example;

public class ReverseString {
    public static void main(String[] args) {
        String s = "selenium";
        System.out.println(reverseStringLooping(s));
        System.out.println(reverseStringWhile(s));
    }

    public static String reverseStringLooping(String s) {
        char[] inputArray = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = inputArray.length - 1; i >= 0; i--) {
            result.append(inputArray[i]);
        }
        return new String(result);
    }

    public static String reverseStringWhile(String s) {
        char[] inputArray = s.toCharArray();
        int left = 0;
        int right = inputArray.length - 1;
        while (left < right) {
            char temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;
            left++;
            right--;
        }
        return new String(inputArray);
    }
}
