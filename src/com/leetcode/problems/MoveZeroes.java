package com.leetcode.problems;

import java.util.Arrays;

public class MoveZeroes {
    static void moveZeros(int[] nums) {
        int counter = 0;
        for(int i= 0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        for(int i=counter; i<nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args){
        int[] nums = {0};
        moveZeros(nums);
    }
}
