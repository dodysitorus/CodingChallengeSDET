package org.example.retest;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] arrayInput = {1,2,4,5};
        System.out.println(findMissingNumber(arrayInput));
    }

    public static int findMissingNumber(int[] arrayInput) {
        int n = arrayInput.length + 1;
        int expectedCount = n * (n + 1) / 2;
        int actualCount = 0;

        for (int i : arrayInput) {
            actualCount += i;
        }
        return expectedCount - actualCount;
    }
}
