package org.example;


public class EvenWordInString {
    public static void main(String[] args) {
        System.out.println(EvenWordInString("Sky is in blue and vast"));
    }

    public static String EvenWordInString(String s) {
        String[] resultArray = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String x : resultArray) {
            if (x.length() % 2 == 0) {
                result.append(x + "\n");
            }
        }
        return result.toString();
    }
}
