package org.example;

public class ReverseAnInteger {
    public static void main(String[] args) {
        System.out.println(reverseInteger(123));
    }

    public static int reverseInteger(int n) {
        int result = 0;
        while (n != 0) {
            int x = n % 10;
            result = (result * 10) + x;
            n = n / 10;
        }
        return result;
    }
}
