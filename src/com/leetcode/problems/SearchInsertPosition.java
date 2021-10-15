package com.leetcode.problems;
/*
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
*/
public class SearchInsertPosition {
    public int implement(){
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;

        int left = 0;
        int right = nums.length - 1;
        while (right >= left){
            int mid = (right - left)/2 + left;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
