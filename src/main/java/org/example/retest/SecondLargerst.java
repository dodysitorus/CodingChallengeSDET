package org.example.retest;

public class SecondLargerst {
    public static void main(String[] args) {
        int[] input = {10, 5, 8};

        int max = 0;
        int temp = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                temp = max;
                max = input[i];
            } else if (input[i] > temp && input[i] < max) {
                temp = input[i];
            }
        }
        System.out.println(temp);
        System.out.println(max);
    }
}
