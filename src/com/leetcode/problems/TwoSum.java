package com.leetcode.problems;

import java.util.Arrays;

public class TwoSum {
    static int[] sum(int[] nums, int target){
        int[] result = new int[2];
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return(result);
                }
            }
        }
        return(result);
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(sum(nums, target)));
    }
}
