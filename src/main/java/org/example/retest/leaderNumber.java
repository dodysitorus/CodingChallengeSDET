package org.example.retest;

import java.util.ArrayList;
import java.util.List;

public class leaderNumber {
    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};
        System.out.println(leaderNumber(a));

    }

    public static List<Integer> leaderNumber(int[] input) {
        List<Integer> result = new ArrayList<>();
        int maxRight = input[input.length - 1];
        result.add(maxRight);

        for (int i = input.length - 2; i >= 0; i--) {
            if (input[i] > maxRight){
                result.add(input[i]);
                maxRight = input[i];
            }
        }
        return result;
    }
}
