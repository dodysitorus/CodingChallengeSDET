package org.example;

import java.util.Arrays;

public class FindSmallestAndLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {-10, 24, 50, -88, 987656};
        System.out.println(Arrays.toString(findMinMax(numbers)));
    }

    public static int[] findMinMax(int[] input) {
        int min = input[0];
        int max = input[0];

        for (int x : input) {
            if (x < min) {
                min = x;
            } else if (x > max) {
                max = x;
            }
        }
        return new int[]{min, max};
    }
}
