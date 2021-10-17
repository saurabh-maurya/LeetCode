package com.leetcode.problems;

public class MaximumSubarray {
    static int maxSubarray(int[] nums) {
        int currentMax = nums[0];
        int overallMax= nums[0];
        for(int i=1; i<nums.length; i++){
            currentMax = Math.max(nums[i], currentMax+nums[i]);
            overallMax = Math.max(overallMax, currentMax);
        }
        return overallMax;
    }
    public static void main(String[] args){
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarray(nums));
    }
}
