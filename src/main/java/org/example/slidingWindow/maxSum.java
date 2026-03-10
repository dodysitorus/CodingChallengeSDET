package org.example.slidingWindow;

public class maxSum {
    public static void main(String[] args) {
        int[] nums = {2,1,5,1,3,2};
        System.out.println(maxSum(nums, 3));

    }
    public static int maxSum(int[] nums, int k){
        int maxSum = 0;
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;

        for (int i = k; i < nums.length ; i++) {
            windowSum += nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
