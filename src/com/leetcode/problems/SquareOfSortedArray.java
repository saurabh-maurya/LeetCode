package com.leetcode.problems;

/*
Given an integer array nums sorted in non-decreasing order,
return an array of the squares of each number sorted in non-decreasing order
*/

import java.util.Arrays;
public class SquareOfSortedArray {
    static int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return(nums);
    }

    public static void main(String[] args) {
        int[] a= {-4, 1, 2, -3};
        System.out.println(Arrays.toString(sortedSquares(a)));
    }
}
