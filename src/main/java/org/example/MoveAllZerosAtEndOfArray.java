package org.example;

import java.util.Arrays;

public class MoveAllZerosAtEndOfArray {
    public static void main(String[] args) {

        int[] input = {0, 1, 2, 0, 3, 0};
        int[] output = moveAllZerosAtEndOfArray(input);
        //output 1,2,3,0,0,0
        System.out.println(Arrays.toString(output));
    }

    public static int[] moveAllZerosAtEndOfArray(int[] input) {
        int nonZeroValue = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0) {
                int temp = input[nonZeroValue];
                input[nonZeroValue] = input[i];
                input[i] = temp;
                nonZeroValue++;
            }
        }
        return input;
    }
}
