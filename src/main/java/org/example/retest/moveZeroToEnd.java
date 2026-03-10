package org.example.retest;

import java.util.Arrays;

public class moveZeroToEnd {
    public static void main(String[] args) {
        int[] input = {1, 0, 3, 4, 8, 0, 9, 1, 0};
        int pos = 0;

        for (int i = 0; i < input.length ; i++) {
            if (input[i] != 0){
                int temp = input[pos];
                input[pos] = input[i];
                input[i] = temp;
                pos++;
            }
        }

        System.out.println(Arrays.toString(input));
    }
}
