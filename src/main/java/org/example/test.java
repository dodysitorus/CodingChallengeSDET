package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        int size = set.size();
        Integer[] array = set.toArray(set.toArray(new Integer[0]));
        Arrays.sort(array);
        System.out.println(set);
        System.out.println(size);
        System.out.println(Arrays.toString(array));

        String s = "asdasdadaQWQWQ";
        s.replaceAll("[^a-z]","").toLowerCase();
        System.out.println(s.length());
        s.toCharArray();
        Arrays.t
    }
}
