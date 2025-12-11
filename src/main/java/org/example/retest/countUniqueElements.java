package org.example.retest;

import java.util.HashSet;

public class countUniqueElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        System.out.println(countUniqueElement(array));
    }

    public static int countUniqueElement(int[] arrayInput){
        HashSet<Integer> set = new HashSet<>();
        for (int i : arrayInput){
            set.add(i);
        }
        return set.size();
    }
}