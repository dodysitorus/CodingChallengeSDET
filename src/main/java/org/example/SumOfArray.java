package org.example;

public class SumOfArray {
    public static void main(String[] args) {
        int[] y = {1, 2, 3, 4};
        System.out.println(sumOfArray(y));
        System.out.println(sumOfArray(y, y.length - 1));

    }

    public static int sumOfArray(int[] numArray) {
        int result = 0;
        for (int num : numArray) {
            result += num;
        }
        return result;
    }

    public static int sumOfArray(int[] array, int n) {
        if (n == 0) {
            return array[n]; //base case
        }
        return array[n] + sumOfArray(array, n - 1);
    }
}
