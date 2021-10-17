package com.leetcode.problems;

/*
Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
 */

public class BinarySearch {
    static int binarySch(int[] nums, int left, int right, int target) {
        if(right >= left){
            int mid = (right - left)/2 + left;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                return binarySch(nums, left, mid - 1, target);
            }
            return binarySch(nums, mid+1, right, target);
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        System.out.println(binarySch(nums, 0, nums.length-1, target));
    }
}
