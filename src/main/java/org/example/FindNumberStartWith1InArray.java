package org.example;

import java.util.ArrayList;
import java.util.List;

public class FindNumberStartWith1InArray {

    public static int getFirstDigit(int num) {
        while (num >= 10) {
            num = num / 10;
        }
        return num;
    }

    public static List<Integer> findNumbersStart1InArr(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            int firstDigit = getFirstDigit(num);
            if (firstDigit == 1) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 55, 163, 123, 98};
        System.out.println(findNumbersStart1InArr(arr));
    }
}
