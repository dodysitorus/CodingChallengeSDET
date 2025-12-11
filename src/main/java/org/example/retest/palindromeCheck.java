package org.example.retest;

public class palindromeCheck {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(palindromeCheck(s));

    }

    public static boolean palindromeCheck(String s) {
        StringBuilder t = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            t.append(s.charAt(i));
        }
        return s.equals(t.toString());
    }
}
