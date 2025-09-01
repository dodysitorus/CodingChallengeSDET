package org.example;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] x = {1, 3, 4, 5};
        System.out.println(missingNumberInArray(x));

    }

    public static int missingNumberInArray(int[] inputArray) {
        int actualResult = 0;
        for (int i = 0; i < inputArray.length; i++) {
            actualResult += inputArray[i];
        }
        int n = inputArray.length + 1;
        int expectedResult = n * (n + 1) / 2;

        return expectedResult - actualResult;
    }
}
