package com.leetcode.problems;
/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
*/

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean implement() {
        int[] nums = {1, 2, 3, 1, 4, 5};
        HashSet<Integer> hash = new HashSet<Integer>();
        for( int i=0; i<nums.length; i++){
            if(hash.contains(nums[i])){
                return true;
            }
            hash.add(nums[i]);
        }
        return false;
    }
}
