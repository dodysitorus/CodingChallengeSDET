package org.example.retest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class alto {
    public static void main(String[] args) {
        Integer[] arr = {100, 70, 200, 35, 65, 73, 45, 10};
        List<Integer> arrList = Arrays.asList(arr);
        Collections.sort(arrList, Collections.reverseOrder());

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arrList.size() ; i+=2) {
            if (i + 1 < arrList.size()){
                result.add(arrList.get(i) + arrList.get(i+1));
            } else {
                result.add(arrList.get(i));
            }
        }

        System.out.println(result);
    }

    public static boolean altoS(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i=+2) {
            System.out.println(i);
        }
        return false;
    }

}
