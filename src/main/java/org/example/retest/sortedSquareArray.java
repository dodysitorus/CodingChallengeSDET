package org.example.retest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class sortedSquareArray {
    public static void main(String[] args) {
        int[] arr = {-4, -2, 0, 1, 2, 3};
        System.out.println(Arrays.toString(sortedSquareArr(arr)));
        System.out.println(Arrays.toString(sortedSquareArrMap(arr)));
    }

    public static int[] sortedSquareArr(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * arr[i];
        }
        Arrays.sort(result);
        return result;
    }

    public static int[] sortedSquareArrMap(int[] arr) {
        return Arrays.stream(arr).map(x -> x * x).sorted().toArray();
    }
}
