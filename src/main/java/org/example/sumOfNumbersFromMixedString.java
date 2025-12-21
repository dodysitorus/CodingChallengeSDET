package org.example;

public class sumOfNumbersFromMixedString {
    public static void main(String[] args) {
        String input = "12abc34xyz56lmn10";
        System.out.println(sumOfNumberFromMixedString(input));
    }

    public static int sumOfNumberFromMixedString(String input) {
        int result = 0;
        StringBuilder intValue = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                intValue.append(c);
            } else {
                if (intValue.length() > 0) {
                    result += Integer.parseInt(intValue.toString());
                    intValue.setLength(0);
                }
            }
        }
        if (intValue.length() > 0){
            result += Integer.parseInt(intValue.toString());
        }
        return result;
    }
}
