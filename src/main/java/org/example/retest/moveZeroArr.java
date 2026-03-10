package org.example.retest;

import java.util.Arrays;

public class moveZeroArr {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 0 && arr[right] != 0) {
                int temp = 0;
                arr[left] = temp;
                arr[left] = arr[right];
                arr[right] = temp;
            }
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
