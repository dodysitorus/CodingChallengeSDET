package org.example;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 6, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        ArrayList<Boolean> result = new ArrayList<>();
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        for (int c : candies) {
            if (c > max) {
                max = c;
            }
        }

        for (int c : candies) {
            if (c >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
