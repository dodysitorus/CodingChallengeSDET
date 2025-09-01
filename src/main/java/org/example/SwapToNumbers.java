package org.example;

public class SwapToNumbers {
    public static void main(String[] args) {
        int[] result = swapToNumbers(1, 2);
        System.out.println("a = " + result[0] + " b = " + result[1]);

        int[] temp = swapToNumbersTemp(1, 2);
        System.out.println("a = " + temp[0] + " b = " + temp[1]);

        int[] bit = swapToNumbersBitwise(1, 2);
        System.out.println("a = " + bit[0] + " b = " + bit[1]);
    }

    public static int[] swapToNumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }

    public static int[] swapToNumbersTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }

    public static int[] swapToNumbersBitwise(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new int[]{a, b};
    }
}
