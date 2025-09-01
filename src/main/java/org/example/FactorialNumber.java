package org.example;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println(factorialLoop(0));
        System.out.println(factorialRecursive(0));

    }

    public static int factorialLoop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecursive(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
}
