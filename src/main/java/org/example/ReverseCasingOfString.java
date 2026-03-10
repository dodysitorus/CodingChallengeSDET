package org.example;

public class ReverseCasingOfString {
    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println(reverseCasingOfString(input));
    }

    public static String reverseCasingOfString(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))){
                result.append(Character.toLowerCase(input.charAt(i)));
            }
            else if (Character.isLowerCase(input.charAt(i))){
                result.append(Character.toUpperCase(input.charAt(i)));
            }
            else {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }
}
