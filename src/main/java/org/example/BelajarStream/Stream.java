package org.example.BelajarStream;

import java.util.Arrays;

public class Stream {
    public static void main(String[] args) {
        String[] buah = {"apel", "durian", "anggur", "pisang"};

        Arrays.stream(buah)
                .forEach(s -> System.out.println(s));

        System.out.println("######");

        Arrays.stream(buah)
                .filter(s -> s.startsWith("a"))
                .forEach(s -> System.out.println(s));


        int[] angka = {1, 2, 3, 4, 5, 6, 7, 8};
        Arrays.stream(angka)
                .filter(a -> a % 2 == 0)
                .forEach(a -> System.out.println(a));

        Arrays.stream(angka)
                .mapToObj(
                        a -> a % 3 == 0 && a % 5 == 0 ? "FizzBuzz" :
                                a % 3 == 0 ? "Fizz" :
                                        a % 5 == 0 ? "Buzz" :
                                                String.valueOf(a)
                ).forEach(a -> System.out.println(a));
    }


}
