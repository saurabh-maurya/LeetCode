package com.leetcode.problems;

import java.util.Arrays;

public class RotateArray {
    static void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            if(i+k < nums.length){
                result[i+k] = nums[i];
            } else {
                result[(i+k)%nums.length] = nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = result[i];
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
    }
}
