package org.example.retest;

import java.util.List;

public class retes {
    public static void main(String[] args) {
        int input = 1234;
        String s = String.valueOf(input);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '2') {
                result.append("two");
            } else if (current == '4') {
                result.append("four");
            } else {
                result.append(current);
            }
        }
        System.out.println(result);
    }
}
