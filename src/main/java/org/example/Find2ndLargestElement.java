package org.example;

import java.util.Arrays;

public class Find2ndLargestElement {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 7, 5};
        System.out.println(secondLargestElementBubleSort(array));
        System.out.println(secondLargestElementStream(array));
        System.out.println(secondLargestElementLoop(array));
    }

    public static int secondLargestElementBubleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    array[i] = array[i] + array[j];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j];
                }
            }
        }

        return array[n - 2];
    }

    public static int secondLargestElementLoop(int[] array) {
        int max = array[0];
        int temp = 0;
        for (int x : array) {
            if (x > max) {
                temp = max;
                max = x;
            }

        }
        return temp;
    }

    public static int secondLargestElementStream(int[] array) {
        Arrays.stream(array).sorted();
        int n = array.length;
        return array[n - 2];
    }
}
